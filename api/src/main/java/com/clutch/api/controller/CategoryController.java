package com.clutch.api.controller;
import com.clutch.api.model.Category;
import com.clutch.api.service.ICategoryService;
import com.clutch.api.service.ICrudService;
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
    public ResponseEntity<Category> findOne(Long id) {
        return super.findOne(id);
    }

    @Override
    public ResponseEntity<Category> update(Long id, Category entity) {
        return super.update(id, entity);
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
    public void delete(Long id) {
        super.delete(id);
    }
}