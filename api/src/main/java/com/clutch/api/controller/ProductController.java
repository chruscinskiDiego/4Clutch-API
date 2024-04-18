package com.clutch.api.controller;

import com.clutch.api.model.Product;
import com.clutch.api.service.ICrudService;
import com.clutch.api.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController extends CrudController<Product,Long> {


    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @Override
    protected ICrudService<Product, Long> getService() {
        return productService;
    }

    @Override
    public ResponseEntity<Product> findOne(Long aLong) {
        return super.findOne(aLong);
    }

    @Override
    public ResponseEntity<Product> update(Long aLong, Product entity) {
        return super.update(aLong, entity);
    }

    @Override
    public ResponseEntity<Product> create(Product entity) {
        return super.create(entity);
    }

    @Override
    public ResponseEntity<List<Product>> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Long aLong) {
        super.delete(aLong);
    }
}
