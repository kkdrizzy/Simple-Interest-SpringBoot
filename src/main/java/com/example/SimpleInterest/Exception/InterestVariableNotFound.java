package com.example.SimpleInterest.Exception;

public class InterestVariableNotFound extends Exception {

    private String message;

    public InterestVariableNotFound() {
    }

    public InterestVariableNotFound(String message) {
        super(message);
        this.message = message;
    }
}
