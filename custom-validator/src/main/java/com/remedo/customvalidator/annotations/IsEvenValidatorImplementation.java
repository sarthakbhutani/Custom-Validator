package com.remedo.customvalidator.annotations;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author SarthakBhutani
 * @since 29/04/2022
 */
public class IsEvenValidatorImplementation implements ConstraintValidator<IsEvenValidator,Integer> {

    @Override
    public boolean isValid(Integer n, ConstraintValidatorContext constraintValidatorContext) {
        return (n % 2 == 0);
    }
}
