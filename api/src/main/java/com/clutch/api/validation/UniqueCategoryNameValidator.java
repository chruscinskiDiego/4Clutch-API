package com.clutch.api.validation;
import com.clutch.api.annotation.UniqueCategoryName;
import com.clutch.api.annotation.UniqueUsername;
import com.clutch.api.repository.CategoryRepository;
import com.clutch.api.repository.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueCategoryNameValidator implements ConstraintValidator<UniqueCategoryName, String> {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(categoryRepository.findByName(s) == null){
            return true;
        }
        return false;
    }

}