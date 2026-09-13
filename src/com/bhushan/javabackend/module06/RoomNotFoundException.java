package com.bhushan.javabackend.module06;

public class RoomNotFoundException extends RuntimeException{
    public RoomNotFoundException(String message){
        super(message);
    }
}
