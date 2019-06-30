package com.sda.exercises.exception;

public class NoElementException extends Exception{
    private String message;

    public NoElementException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "NoElementException: " + this.message;
    }
}
