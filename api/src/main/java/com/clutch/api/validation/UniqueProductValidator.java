package com.clutch.api.validation;
import com.clutch.api.annotation.UniqueProduct;
import com.clutch.api.repository.ProductRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueProductValidator implements ConstraintValidator<UniqueProduct, String> {

    @Autowired
    ProductRepository productRepository;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(productRepository.findByName(s) == null){
            return true;
        }
        return false;
    }

}