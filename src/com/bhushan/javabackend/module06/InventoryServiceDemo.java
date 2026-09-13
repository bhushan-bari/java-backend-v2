package com.bhushan.javabackend.module06;

public class InventoryServiceDemo {

    public static void main(String[] args) {

        String productName = "Laptop";
        int availableStock = 6;
        int requestedQuantity = 5;

        try {

            if (requestedQuantity > availableStock) {
                throw new InsufficientStockException(
                        "Insufficient stock for " + productName
                );
            }

            System.out.println(
                    "Order can be processed"
            );

        } catch (InsufficientStockException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println(
                    "Inventory operation completed"
            );
        }
    }
}