package com.clutch.api.service.impl;
import com.clutch.api.model.Exterior;
import com.clutch.api.repository.ExteriorRepository;
import com.clutch.api.service.IExteriorService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExteriorServiceImpl extends CrudServiceImpl<Exterior, Long> implements IExteriorService {
    private final ExteriorRepository exteriorRepository;

    public ExteriorServiceImpl(ExteriorRepository exteriorRepository) {
        this.exteriorRepository = exteriorRepository;
    }

    @Override
    protected JpaRepository<Exterior, Long> getRepository() {
        return exteriorRepository;
    }

    @Override
    protected void updateEntityFields(Exterior existingEntity, Exterior newEntity) {
        existingEntity.setName(newEntity.getName());
    }

    @Override
    public long count() {
        return 0;
    }
}
