package com.adi.exception;

/**
 * Created by adithya on 2/11/17.
 */
public class CustomException extends RuntimeException {

    private String exceptionMessage;

    public CustomException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
