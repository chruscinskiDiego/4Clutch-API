package com.clutch.api.service.impl;

import com.clutch.api.model.Category;
import com.clutch.api.model.User;
import com.clutch.api.repository.CategoryRepository;
import com.clutch.api.repository.UserRepository;
import com.clutch.api.service.ICategoryService;
import com.clutch.api.service.IUserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CrudServiceImpl<User, Long> implements IUserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    protected JpaRepository<User, Long> getRepository() {
        return userRepository;
    }

    @Override
    public long count() {
        return 0;
    }
}
