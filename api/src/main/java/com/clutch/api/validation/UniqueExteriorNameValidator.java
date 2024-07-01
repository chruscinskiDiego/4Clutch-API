package com.clutch.api.validation;
import com.clutch.api.annotation.UniqueExteriorName;
import com.clutch.api.repository.ExteriorRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueExteriorNameValidator implements ConstraintValidator<UniqueExteriorName, String> {

    @Autowired
    ExteriorRepository exteriorRepository;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(exteriorRepository.findByName(s) == null){
            return true;
        }
        return false;
    }

}