package com.bhushan.javabackend.module06;

class PaymentFailedException extends Exception {

    public PaymentFailedException(String message) {
        super(message);
    }
}

public class PaymentProcessingExceptionDemo {

    static void processPayment(double amount, double availableBalance)
            throws PaymentFailedException {

        if (amount <= 0) {
            throw new PaymentFailedException("Payment amount must be greater than zero.");
        }

        if (amount > availableBalance) {
            throw new PaymentFailedException("Insufficient balance for payment.");
        }

        System.out.println("Payment processed successfully.");
        System.out.println("Amount paid: " + amount);
    }

    public static void main(String[] args) {

        double amount = 5000;
        double availableBalance = 3000;

        try {
            processPayment(amount, availableBalance);
        } catch (PaymentFailedException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }

        System.out.println("Application continues...");
    }
}