package com.bhushan.javabackend.module05;

abstract class RideVehicle {

    private int vehicleId;
    private String vehicleNumber;

    public RideVehicle(int vehicleId, String vehicleNumber) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void displayVehicle() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle Number: " + vehicleNumber);
    }

    public abstract double calculateFare(double distance);
}

class RideCar extends RideVehicle {

    private double ratePerKm;

    public RideCar(
            int vehicleId,
            String vehicleNumber,
            double ratePerKm) {

        super(vehicleId, vehicleNumber);
        this.ratePerKm = ratePerKm;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

class RideBike extends RideVehicle {

    private double ratePerKm;

    public RideBike(
            int vehicleId,
            String vehicleNumber,
            double ratePerKm) {

        super(vehicleId, vehicleNumber);
        this.ratePerKm = ratePerKm;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

interface RidePaymentMethod {

    void pay(double amount);
}

class RideCardPayment implements RidePaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(
                "Card payment successful: ₹" + amount
        );
    }
}

class RideUpiPayment implements RidePaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(
                "UPI payment successful: ₹" + amount
        );
    }
}

public class RideBookingOOPDemo {

    public static void main(String[] args) {

        RideVehicle car =
                new RideCar(101, "MH12AB1234", 15);

        RideVehicle bike =
                new RideBike(102, "MH12CD5678", 8);

        double carDistance = 10;
        double bikeDistance = 12;

        System.out.println("CAR");
        car.displayVehicle();

        double carFare =
                car.calculateFare(carDistance);

        System.out.println("Car Fare: ₹" + carFare);

        System.out.println();

        System.out.println("BIKE");
        bike.displayVehicle();

        double bikeFare =
                bike.calculateFare(bikeDistance);

        System.out.println("Bike Fare: ₹" + bikeFare);

        System.out.println();

        RidePaymentMethod cardPayment =
                new RideCardPayment();

        cardPayment.pay(carFare);

        RidePaymentMethod upiPayment =
                new RideUpiPayment();

        upiPayment.pay(bikeFare);
    }
}