package com.clutch.api.controller;

import com.clutch.api.model.Category;
import com.clutch.api.model.Product;
import com.clutch.api.service.ICategoryService;
import com.clutch.api.service.ICrudService;
import com.clutch.api.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController extends CrudController<Category,Long> {


    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    protected ICrudService<Category, Long> getService() {
        return categoryService;
    }

    @Override
    public ResponseEntity<Category> findOne(Long aLong) {
        return super.findOne(aLong);
    }

    @Override
    public ResponseEntity<Category> update(Long aLong, Category entity) {
        return super.update(aLong, entity);
    }

    @Override
    public ResponseEntity<Category> create(Category entity) {
        return super.create(entity);
    }

    @Override
    public ResponseEntity<List<Category>> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Long aLong) {
        super.delete(aLong);
    }
}
