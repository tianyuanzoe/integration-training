package com.programmingtechie.orderservice.exceptionHandler;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zoetian
 * @create 6/20/23
 */

@RestControllerAdvice
public class ApplicationExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseInfo handleInvalidArgument(MethodArgumentNotValidException exception){
        Map<String,String> errorMap = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error->{
            errorMap.put(error.getField(),error.getDefaultMessage());
        });
        return new ResponseInfo(HttpStatus.BAD_REQUEST.value() + "", errorMap);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseInfo handleConstraintViolation(ConstraintViolationException exception){
        Map<String,String> errorMap = new HashMap<>();
        exception.getConstraintViolations().forEach(error->{
            errorMap.put(error.getPropertyPath().toString(),error.getMessage());
        });
        return new ResponseInfo(HttpStatus.BAD_REQUEST.value() + "", errorMap);
    }

}
