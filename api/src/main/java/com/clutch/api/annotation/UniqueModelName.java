package com.clutch.api.annotation;
import com.clutch.api.validation.UniqueModelNameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueModelNameValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueModelName {

    String message() default "Model name already exists";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}