package com.clutch.api.validation;
import com.clutch.api.annotation.UniqueCategoryName;
import com.clutch.api.annotation.UniqueModelName;
import com.clutch.api.repository.ModelRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueModelNameValidator implements ConstraintValidator<UniqueModelName, String> {

    @Autowired
    ModelRepository modelRepository;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(modelRepository.findByName(s) == null){
                return true;
        }
        return false;
    }

}