package com.bhushan.javabackend.module06;

public class HotelBookingExceptionDemo {

    public static void main(String[] args) {

        int roomNumber = 501;
        boolean roomExists = false;

        try {

            if (!roomExists) {
                throw new RoomNotFoundException(
                        "Room " + roomNumber + " does not exist"
                );
            }

            System.out.println("Room booking successful");

        } catch (RoomNotFoundException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println(
                    "Hotel booking process completed"
            );
        }
    }
}