package com.bhushan.javabackend.module03;

public class BankMethodsDemo {

    // Method 1: Calculate final balance
    public static double calculateBalance(double openingBalance, double deposit, double withdrawal) {

        return openingBalance + deposit - withdrawal;
    }

    // Method 2: Check transaction eligibility
    public static boolean isEligibleForTransaction(boolean accountActive,
                                                   boolean kycCompleted,
                                                   double balance,
                                                   double transactionAmount) {

        return accountActive && kycCompleted && balance >= transactionAmount;
    }

    // Method 3: Display transaction details
    public static void displayTransaction(String transactionId,
                                          double amount,
                                          String transactionType) {

        System.out.println("Transaction ID   : " + transactionId);
        System.out.println("Transaction Type : " + transactionType);
        System.out.println("Amount           : â‚¹" + amount);
    }

    // Method 4: Calculate interest
    public static double calculateInterest(double balance,
                                           double interestRate) {

        return balance * interestRate / 100;
    }

    // Main method
    public static void main(String[] args) {

        // Method 1
        double finalBalance = calculateBalance(
                50000,
                10000,
                5000
        );

        System.out.println("Final Balance: â‚¹" + finalBalance);
        System.out.println();

        // Method 2
        boolean eligible = isEligibleForTransaction(
                true,
                true,
                finalBalance,
                20000
        );

        System.out.println("Eligible for Transaction: " + eligible);
        System.out.println();

        // Method 3
        displayTransaction(
                "TXN1001",
                20000,
                "WITHDRAWAL"
        );

        System.out.println();

        // Method 4
        double interest = calculateInterest(finalBalance, 6.5);
        System.out.println("Calculated Interest: â‚¹" + interest);
    }
}
