package com.sparta.ajcd;

public class InvalidTimeException extends Exception{

    @Override
    public String getMessage() {
        return "Invalid Time Entered";
    }
    
}
