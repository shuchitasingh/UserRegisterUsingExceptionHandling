package com.bridgelabz;

public class UserDefineException extends Throwable {
    String  errorMessage;
    public  UserDefineException(String message) {
        this.errorMessage = message;
    }
}
