package com.example.SimpleInterest.Exception;

public class InterestVariableSetZero extends Exception{

    private String message;

    public InterestVariableSetZero() {
    }

    public InterestVariableSetZero(String message) {
        super(message);
        this.message = message;
    }
}
