package com.clutch.api.service;
import com.clutch.api.model.Product;

import java.util.List;

public interface IProductService extends ICrudService<Product, Long> {

    public List<Product> getProductByCategoryId(long id);
}
