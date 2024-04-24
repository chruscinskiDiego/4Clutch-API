package com.clutch.api.validation;
import com.clutch.api.annotation.UniqueUsername;
import com.clutch.api.repository.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(userRepository.findByUsername(s) == null){
            return true;
        }
        return false;
    }

}