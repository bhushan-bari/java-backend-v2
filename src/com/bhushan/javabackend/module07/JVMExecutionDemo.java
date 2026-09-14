package com.bhushan.javabackend.module07;

public class JVMExecutionDemo {

    private static int calculateTotal(int price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        int price = 500;
        int quantity = 3;

        int total = calculateTotal(price, quantity);

        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
    }
}