package com.bhushan.javabackend.module04;

class MovieTicket {

    String ticketId;
    String movieName;
    String seatNumber;
    double ticketPrice;

    double calculateTotalPrice() {
        return ticketPrice;
    }

    void displayTicket() {
        System.out.println("Ticket ID    : " + ticketId);
        System.out.println("Movie        : " + movieName);
        System.out.println("Seat Number  : " + seatNumber);
        System.out.println("Ticket Price : â‚¹" + calculateTotalPrice());
        System.out.println();
    }
}

public class MovieTicketDemo {

    public static void main(String[] args) {

        MovieTicket ticket1 = new MovieTicket();

        ticket1.ticketId = "TKT501";
        ticket1.movieName = "Interstellar";
        ticket1.seatNumber = "A12";
        ticket1.ticketPrice = 350;

        MovieTicket ticket2 = new MovieTicket();

        ticket2.ticketId = "TKT502";
        ticket2.movieName = "Inception";
        ticket2.seatNumber = "B08";
        ticket2.ticketPrice = 300;

        ticket1.displayTicket();
        ticket2.displayTicket();
    }
}
