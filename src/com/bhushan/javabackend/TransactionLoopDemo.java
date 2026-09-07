package com.bhushan.javabackend;

public class TransactionLoopDemo {

    public static void main(String[] args) {

        double[] transactions = {
                1200.50,
                2500.00,
                750.75,
                4300.00,
                1500.25
        };

        double total = 0;

        for (int i = 0; i < transactions.length; i++) {
            System.out.println(
                    "Transaction " + (i + 1) + ": ₹" + transactions[i]
            );

            total = total + transactions[i];
        }

        System.out.println("--------------------");
        System.out.println("Total Transaction Amount: ₹" + total);
    }
}