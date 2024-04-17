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

    @PostMapping
    public ResponseEntity<T> create(@RequestBody @Valid T entity) {
        T savedEntity = getService().save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEntity);
    }

    @PutMapping("{id}")
    public ResponseEntity<T> update(@PathVariable ID id, @RequestBody @Valid T entity) {
        T updatedEntity = getService().save(entity);
        return ResponseEntity.ok().body(updatedEntity);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public void delete(@RequestBody ID id) {
        getService().delete(id);
    }
}