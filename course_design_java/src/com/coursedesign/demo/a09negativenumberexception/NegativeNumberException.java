package com.coursedesign.demo.a09negativenumberexception;

public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
