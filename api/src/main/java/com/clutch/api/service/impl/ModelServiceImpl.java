package com.clutch.api.service.impl;
import com.clutch.api.model.Model;
import com.clutch.api.repository.ModelRepository;
import com.clutch.api.service.IModelService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl extends CrudServiceImpl<Model, Long> implements IModelService {
    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    protected JpaRepository<Model, Long> getRepository() {
        return modelRepository;
    }

    @Override
    protected void updateEntityFields(Model existingEntity, Model newEntity) {
        existingEntity.setName(newEntity.getName());
    }

    @Override
    public long count() {
        return 0;
    }
}
