package com.bhushan.javabackend.module03;

public class BankTransactionChallenge {

    // Method 1
    public static double calculateBalance(double openingBalance,
                                          double deposit,
                                          double withdrawal) {

        return openingBalance + deposit - withdrawal;
    }

    // Method 2
    public static boolean isEligibleForTransaction(boolean accountActive,
                                                   boolean kycCompleted,
                                                   double balance,
                                                   double transactionAmount) {

        return accountActive && kycCompleted && balance >= transactionAmount;
    }

    // Method 3
    public static double calculateInterest(double balance, double interestRate) {

        return balance * interestRate / 100;
    }

    // Method 4
    public static void displayTransaction(String transactionId,
                                          String transactionType,
                                          double amount,
                                          double remainingBalance) {

        System.out.println("Transaction ID     : " + transactionId);
        System.out.println("Transaction Type   : " + transactionType);
        System.out.println("Transaction Amount : â‚¹" + amount);
        System.out.println("Remaining Balance  : â‚¹" + remainingBalance);
    }

    // Method 5
    public static double processTransaction(double balance,
                                            double transactionAmount,
                                            String transactionType) {

        if (transactionType.equals("WITHDRAWAL")) {
            return balance - transactionAmount;

        } else if (transactionType.equals("DEPOSIT")) {
            return balance + transactionAmount;

        } else {
            return balance;
        }
    }

    public static void main(String[] args) {

        double balance = calculateBalance(
                50000,
                10000,
                5000
        );

        System.out.println("Initial Balance: â‚¹" + balance);
        System.out.println();

        boolean eligible = isEligibleForTransaction(
                true,
                true,
                balance,
                15000
        );

        System.out.println("Transaction Eligible: " + eligible);
        System.out.println();

        if (eligible) {

            balance = processTransaction(
                    balance,
                    15000,
                    "WITHDRAWAL"
            );

            displayTransaction(
                    "TXN10001",
                    "WITHDRAWAL",
                    15000,
                    balance
            );
        }

        System.out.println();

        double interest = calculateInterest(
                balance,
                6.5
        );

        System.out.println("Interest @ 6.5%: â‚¹" + interest);
    }
}
