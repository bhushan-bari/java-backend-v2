package com.bhushan.javabackend;

public class BankTransactionStringDemo {

    public static void main(String[] args) {

        String transactionId = "TXN-2026-000123";
        String customerName = "Sachin";
        String transactionType = "UPI";
        String status = "SUCCESS";

        String transactionMessage =
                "Transaction " + transactionId
                        + " | Customer: " + customerName
                        + " | Type: " + transactionType
                        + " | Status: " + status;

        System.out.println(transactionMessage);

        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Customer: " + customerName);
        System.out.println("Transaction successful: "
                + status.equals("SUCCESS"));
    }
}