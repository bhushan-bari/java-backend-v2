package com.bhushan.javabackend.module02;

public class BankTransaction {

    public static void main(String[] args) {

        String transactionId = "TXN1001";
        String accountNumber = "SBI987654";
        double amount = 15000.00;
        String transactionType = "TRANSFER";
        boolean successful = true;

        System.out.println("===== Bank Transaction =====");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: â‚¹" + amount);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Successful: " + successful);
    }
}
