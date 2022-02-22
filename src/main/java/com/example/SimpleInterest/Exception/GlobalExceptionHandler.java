package com.example.SimpleInterest.Exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Value(value = "${data.exception.message1}")
    private String message1;

    @Value(value = "${data.exception.message2}")
    private String message2;

    @Value(value = "${data.exception.message3}")
    private String message3;

    @Value(value = "${data.exception.message4}")
    private String message4;


    @ExceptionHandler(InterestVariableSetZero.class)
    public ResponseEntity interestVariableSetZero(InterestVariableSetZero interestVariableSetZero){
        return new ResponseEntity(message1, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(InterestVariableNotFound.class)
    public ResponseEntity interestVariableNotFound(InterestVariableNotFound interestVariableNotFound){
        return new ResponseEntity(message2, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MissingInterestVariable.class)
    public ResponseEntity missingInterestVariable(MissingInterestVariable missingInterestVariable){
        return new ResponseEntity(message3, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity noInternetConnection(Exception ex){
        return new ResponseEntity(message4, HttpStatus.GATEWAY_TIMEOUT);
    }


}
