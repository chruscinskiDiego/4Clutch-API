package com.clutch.api.controller;

import com.clutch.api.service.ICrudService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CrudController <T, D, ID extends Serializable>{


    protected abstract ICrudService<T, ID> getService();


    @GetMapping
    public ResponseEntity<List<T>> findAll() {

        List<T> list = getService().findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<T> findOne(@PathVariable ID id) {
        T entity = getService().findOne(id);
        if (entity == null) {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok().body(entity);
        }
    }
    @PostMapping
    public ResponseEntity<T> create(@RequestBody @Valid T entity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(getService().save(entity));

    }

    @PutMapping("{id}")
    public ResponseEntity<D> update(@PathVariable ID id, @RequestBody @Valid D entity) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(getService().save());

    }






}
