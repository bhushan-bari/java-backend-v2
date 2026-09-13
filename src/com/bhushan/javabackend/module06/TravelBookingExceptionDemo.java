package com.bhushan.javabackend.module06;

public class TravelBookingExceptionDemo {

    public static void main(String[] args) {

        String passengerName = "Adam";
        int seats = 5;

        try {

            if (seats <= 0) {
                throw new IllegalArgumentException(
                        "Seats must be greater than zero"
                );
            }

            System.out.println(
                    "Booking confirmed for " + passengerName
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Invalid seat count: " + e.getMessage()
            );

        } finally {

            System.out.println("Booking process completed");
        }
    }
}