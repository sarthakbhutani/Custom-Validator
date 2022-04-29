package com.remedo.customvalidator.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

/**
 * @author SarthakBhutani
 * @since 29/04/2022
 */
@Target( { FIELD, PARAMETER })
//define on what kind of things can this annotation be attached to
@Retention(RetentionPolicy.RUNTIME)
//can be accessed during runtime
@Documented
//including annotations in documentation

@Constraint(validatedBy = IsEvenValidatorImplementation.class)
public @interface IsEvenValidator {
    //error message
    public String message() default "Invalid number: Number must be even";

    //represents group of constraints
    public Class<?>[] groups() default {};

    //represents additional information about annotation
    public Class<? extends Payload>[] payload() default {};
}

