package com.clutch.api.service.impl;
import com.clutch.api.model.Product;
import com.clutch.api.repository.ProductRepository;
import com.clutch.api.service.IProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl extends CrudServiceImpl<Product, Long> implements IProductService {

    private final ProductRepository productRepository;

    public List<Product> getProductByCategoryId(long id){
        return productRepository.findByCategoryId(id);
    }

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    protected JpaRepository<Product, Long> getRepository() {
        return productRepository;
    }

    @Override
    protected void updateEntityFields(Product existingEntity, Product newEntity) {
        existingEntity.setName(newEntity.getName());
        existingEntity.setDescription(newEntity.getDescription());
        existingEntity.setImageUrl(newEntity.getImageUrl());
        existingEntity.setPrice(newEntity.getPrice());
        existingEntity.setCategoryId(newEntity.getCategoryId());
    }


    @Override
    public long count() {
        return 0;
    }

}
