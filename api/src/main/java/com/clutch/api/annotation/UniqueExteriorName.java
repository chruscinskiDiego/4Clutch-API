package com.clutch.api.annotation;
import com.clutch.api.validation.UniqueExteriorNameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueExteriorNameValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueExteriorName {

    String message() default "Exterior name already exists";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}