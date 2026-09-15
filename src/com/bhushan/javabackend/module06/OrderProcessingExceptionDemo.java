package com.bhushan.javabackend.module06;

class ProductUnavailableException extends Exception {

    public ProductUnavailableException(String message) {
        super(message);
    }
}

class InvalidOrderAmountException extends Exception {

    public InvalidOrderAmountException(String message) {
        super(message);
    }
}

public class OrderProcessingExceptionDemo {

    static void validateOrder(int quantity, double totalAmount)
            throws ProductUnavailableException, InvalidOrderAmountException {

        if (quantity <= 0) {
            throw new ProductUnavailableException(
                    "Product quantity must be greater than zero."
            );
        }

        if (totalAmount <= 0) {
            throw new InvalidOrderAmountException(
                    "Order amount must be greater than zero."
            );
        }
    }

    static void processOrder(int quantity, double totalAmount)
            throws ProductUnavailableException, InvalidOrderAmountException {

        validateOrder(quantity, totalAmount);

        System.out.println("Order validation successful.");
        System.out.println("Order processed successfully.");
    }

    public static void main(String[] args) {

        int quantity = 2;
        double totalAmount = 1500;

        try {
            processOrder(quantity, totalAmount);
        } catch (ProductUnavailableException | InvalidOrderAmountException e) {
            System.out.println("Order processing failed: " + e.getMessage());
        }

        System.out.println("Order service is still running...");
    }
}