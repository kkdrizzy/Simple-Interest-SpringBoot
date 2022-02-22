package com.example.SimpleInterest.Exception;

public class MissingInterestVariable extends Exception {

    private String message;

    public MissingInterestVariable() {
    }

    public MissingInterestVariable(String message) {
        super(message);
        this.message = message;
    }
}
