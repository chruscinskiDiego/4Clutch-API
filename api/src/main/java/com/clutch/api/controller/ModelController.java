package com.clutch.api.controller;
import com.clutch.api.model.Model;
import com.clutch.api.service.IModelService;
import com.clutch.api.service.ICrudService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("models")
public class ModelController extends CrudController<Model,Long> {


    private final IModelService modelService;

    public ModelController(IModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    protected ICrudService<Model, Long> getService() {
        return modelService;
    }

    @Override
    public ResponseEntity<Model> findOne(Long id) {
        return super.findOne(id);
    }

    @Override
    public ResponseEntity<Model> update(Long id, Model entity) {
        return super.update(id, entity);
    }

    @Override
    public ResponseEntity<Model> create(Model entity) {
        return super.create(entity);
    }

    @Override
    public ResponseEntity<List<Model>> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }
}