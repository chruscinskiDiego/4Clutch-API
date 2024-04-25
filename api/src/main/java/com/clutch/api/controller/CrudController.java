package com.clutch.api.controller;
import com.clutch.api.service.ICrudService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

public abstract class CrudController<T, ID extends Serializable> {

    protected abstract ICrudService<T, ID> getService();

    //GET METHODS
    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        List<T> list = getService().findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<T> findOne(@PathVariable ID id) {
        T entity = getService().findOne(id);
        return entity != null ? ResponseEntity.ok().body(entity) : ResponseEntity.notFound().build();
    }

    @GetMapping("count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(getService().count());
    }

    @GetMapping("page")
    public ResponseEntity<Page<T>> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String order,
            @RequestParam(required = false, defaultValue = "true") Boolean asc
    ) {
        try {
            if (page < 0 || size <= 0) {
                throw new IllegalArgumentException("Invalid page or size value");
            }

            Pageable pageable;
            if (order != null && !order.isEmpty()) {
                Sort.Direction direction = asc ? Sort.Direction.ASC : Sort.Direction.DESC;
                pageable = PageRequest.of(page, size, direction, order);
            } else {
                pageable = PageRequest.of(page, size);
            }

            Page<T> result = getService().findAll(pageable);

            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    //POST METHODS
    @PostMapping
    public ResponseEntity<T> create(@RequestBody @Valid T entity) {
        T savedEntity = getService().save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEntity);
    }

    //PUT METHODS
    @PutMapping("{id}")
    public ResponseEntity<T> update(@PathVariable ID id, @RequestBody @Valid T entity) {
        T updatedEntity = getService().update(id, entity);
        return ResponseEntity.ok().body(updatedEntity);
    }

    //DELETE METHODS
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable ID id) {
        getService().delete(id);
    }


}