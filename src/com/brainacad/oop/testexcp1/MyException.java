package com.brainacad.oop.testexcp1;

public class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
