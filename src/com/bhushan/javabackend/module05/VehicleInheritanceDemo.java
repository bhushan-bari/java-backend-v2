package com.bhushan.javabackend.module05;

class Vehicle {

    String brand;
    String model;

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {

    int numberOfDoors;

    void displayCar() {
        displayVehicle();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class VehicleInheritanceDemo {

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Toyota";
        car.model = "Camry";
        car.numberOfDoors = 4;

        car.displayCar();
    }
}