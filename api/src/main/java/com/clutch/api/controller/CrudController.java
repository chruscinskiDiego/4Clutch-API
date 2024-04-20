package com.clutch.api.controller;
import com.clutch.api.service.ICrudService;
import jakarta.validation.Valid;
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