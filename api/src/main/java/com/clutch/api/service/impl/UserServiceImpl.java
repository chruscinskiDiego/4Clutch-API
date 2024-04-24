package com.clutch.api.service.impl;
import com.clutch.api.model.User;
import com.clutch.api.repository.UserRepository;
import com.clutch.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CrudServiceImpl<User, Long> implements IUserService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    public User save(User user){

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        return userRepository.save(user);

    }

    @Override
    protected JpaRepository<User, Long> getRepository() {
        return userRepository;
    }

    @Override
    protected void updateEntityFields(User existingEntity, User newEntity) {
        existingEntity.setUsername(newEntity.getUsername());
        existingEntity.setPassword(newEntity.getPassword());
        existingEntity.setEmail(newEntity.getEmail());
    }


    @Override
    public long count() {
        return 0;
    }
}
