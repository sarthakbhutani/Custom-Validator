package com.remedo.customvalidator.controller;

import com.remedo.customvalidator.dto.NumberDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author SarthakBhutani
 * @since 29/04/2022
 */
@RestController
@RequestMapping("/number")
public class NumberController {

    Logger log = LoggerFactory.getLogger(NumberController.class);

    /**
     * @author Sarthak Bhutani
     * @since 29/04/2022
     * @param number
     * Method to check if number is even
     * @return {@link NumberDto} if success
     * @return {@link org.springframework.http.HttpStatus} 400 if number is not odd
     */
    @GetMapping("/isEven")
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public NumberDto isEven(@Valid @RequestBody NumberDto number){
        log.debug("Request received in controller to check if number - {} is even",number);
        return number;
    }

}
