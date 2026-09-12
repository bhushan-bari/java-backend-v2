package com.bhushan.javabackend.module05;

class DeliveryPartner {

    private String name;

    public DeliveryPartner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void calculateDeliveryTime() {
        System.out.println("Generic delivery time");
    }
}

class BikeDelivery extends DeliveryPartner {

    public BikeDelivery(String name) {
        super(name);
    }

    @Override
    public void calculateDeliveryTime() {
        System.out.println(getName() + ": 30 minutes");
    }
}

class CarDelivery extends DeliveryPartner {

    public CarDelivery(String name) {
        super(name);
    }

    @Override
    public void calculateDeliveryTime() {
        System.out.println(getName() + ": 45 minutes");
    }
}

public class DeliveryPolymorphismDemo {

    public static void main(String[] args) {

        BikeDelivery bike = new BikeDelivery("Rahul");
        bike.calculateDeliveryTime();

        CarDelivery car = new CarDelivery("Amit");
        car.calculateDeliveryTime();
    }
}