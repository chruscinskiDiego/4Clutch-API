package com.clutch.api.controller;
import com.clutch.api.model.Product;
import com.clutch.api.service.ICrudService;
import com.clutch.api.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<Product> findOne(Long id) {
        return super.findOne(id);
    }

    @Override
    public ResponseEntity<Product> update(Long id, Product entity) {
        return super.update(id, entity);
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
    public void delete(Long id ) {
        super.delete(id);
    }
}
