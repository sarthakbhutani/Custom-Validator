package com.remedo.customvalidator.dto;

import com.remedo.customvalidator.annotations.IsEvenValidator;

/**
 * @author SarthakBhutani
 * @since 29/04/2022
 */
public class NumberDto {

    @IsEvenValidator
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Default Constructor
     */
    public NumberDto() {
    }

    /**
     * @param number
     * Constructor to create number
     */
    public NumberDto(int number) {
        this.number = number;
    }
}
