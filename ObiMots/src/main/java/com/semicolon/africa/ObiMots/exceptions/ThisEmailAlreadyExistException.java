package com.semicolon.africa.ObiMots.exceptions;

public class ThisEmailAlreadyExistException extends RuntimeException{
    public ThisEmailAlreadyExistException(String message){
        super(message);
    }
}
