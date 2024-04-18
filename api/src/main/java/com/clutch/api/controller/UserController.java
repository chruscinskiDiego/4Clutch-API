package com.clutch.api.controller;
import com.clutch.api.model.User;
import com.clutch.api.service.ICrudService;
import com.clutch.api.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController extends CrudController<User,Long> {


    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @Override
    protected ICrudService<User, Long> getService() {
        return userService;
    }

    @Override
    public ResponseEntity<User> findOne(Long id) {
        return super.findOne(id);
    }

    @Override
    public ResponseEntity<User> update(Long id, User entity) {
        return super.update(id, entity);
    }

    @Override
    public ResponseEntity<User> create(User entity) {
        return super.create(entity);
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }
}
