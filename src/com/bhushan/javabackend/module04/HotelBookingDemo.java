package com.bhushan.javabackend.module04;

class HotelBooking {

    int bookingId;
    String guestName;
    int roomNumber;
    int numberOfNights;

    HotelBooking(int bookingId, String guestName,
                 int roomNumber, int numberOfNights) {

        this.bookingId = bookingId;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.numberOfNights = numberOfNights;
    }

    void displayBooking() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Guest: " + guestName);
        System.out.println("Room: " + roomNumber);
        System.out.println("Nights: " + numberOfNights);
        System.out.println();
    }
}

public class HotelBookingDemo {

    public static void main(String[] args) {

        HotelBooking booking1 =
                new HotelBooking(101, "Rahul", 205, 3);

        HotelBooking booking2 =
                new HotelBooking(102, "Priya", 310, 2);

        HotelBooking booking3 =
                new HotelBooking(103, "Amit", 415, 5);

        booking1.displayBooking();
        booking2.displayBooking();
        booking3.displayBooking();
    }
}