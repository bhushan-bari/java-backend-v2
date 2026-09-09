package com.bhushan.javabackend;

class RentalVehicle {

    String vehicleId;
    String brand;
    String model;
    double dailyPrice;

    double calculateRentalCost(int days) {
        return dailyPrice * days;
    }

    void displayVehicle() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Brand      : " + brand);
        System.out.println("Model      : " + model);
        System.out.println("Daily Price: ₹" + dailyPrice);
    }
}

public class VehicleRentalDemo {

    public static void main(String[] args) {

        RentalVehicle vehicle1 = new RentalVehicle();

        vehicle1.vehicleId = "VH101";
        vehicle1.brand = "Toyota";
        vehicle1.model = "Innova";
        vehicle1.dailyPrice = 2500;

        RentalVehicle vehicle2 = new RentalVehicle();

        vehicle2.vehicleId = "VH102";
        vehicle2.brand = "Hyundai";
        vehicle2.model = "Creta";
        vehicle2.dailyPrice = 2000;

        System.out.println("Vehicle 1");
        vehicle1.displayVehicle();
        System.out.println("Rental Cost for 3 Days: ₹"
                + vehicle1.calculateRentalCost(3));

        System.out.println();

        System.out.println("Vehicle 2");
        vehicle2.displayVehicle();
        System.out.println("Rental Cost for 5 Days: ₹"
                + vehicle2.calculateRentalCost(5));
    }
}