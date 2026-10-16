package com.bhushan.javabackend.module08;

public class TransactionStatusComparisonDemo {
    public static void main(String[] args) {
        String receivedStatus = new String("SUCCESS");

        if ("SUCCESS".equals(receivedStatus)) {
            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction status mismatch");
        }
    }
}