package com.clutch.api.service.impl;
import com.clutch.api.model.Category;
import com.clutch.api.repository.CategoryRepository;
import com.clutch.api.service.ICategoryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends CrudServiceImpl<Category, Long> implements ICategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    protected JpaRepository<Category, Long> getRepository() {
        return categoryRepository;
    }

    @Override
    protected void updateEntityFields(Category existingEntity, Category newEntity) {
        existingEntity.setName(newEntity.getName());
    }

    @Override
    public long count() {
        return 0;
    }
}
