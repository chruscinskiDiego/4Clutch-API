package com.clutch.api.controller;
import com.clutch.api.model.Product;
import com.clutch.api.service.ICrudService;
import com.clutch.api.service.IProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("products")
public class ProductController extends CrudController<Product, Long>{

    private final IProductService productService;

    public ProductController(IProductService service) {
        this.productService = service;
    }

    @Override
    protected ICrudService<Product, Long> getService() {
        return productService;
    }
}
