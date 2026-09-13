package com.bhushan.javabackend.module06;

public class ProductPriceExceptionDemo {

    public static void main(String[] args) {

        double price = 1000;
        int quantity = 0;

        try {

            if (quantity <= 0) {
                throw new IllegalArgumentException(
                        "Quantity must be greater than zero"
                );
            }

            double totalPrice = price / quantity;

            System.out.println("Total Price: " + totalPrice);

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid quantity: " + e.getMessage());

        } finally {

            System.out.println("Price calculation completed");

        }
    }
}