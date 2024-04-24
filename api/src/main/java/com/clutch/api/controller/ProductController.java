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


@RestController
@RequestMapping("products")
public class ProductController extends CrudController<Product, Long>{

    private final IProductService productService;

    public ProductController(IProductService service) {
        this.productService = service;
    }

    @GetMapping("/find-by-category/{id}")
    public ResponseEntity<List<Product>> findByCategory(@PathVariable Long id) {
        List<Product> list = productService.getProductByCategoryId(id);
        return ResponseEntity.ok().body(list);
    }

    @Override
    protected ICrudService<Product, Long> getService() {
        return productService;
    }
}
