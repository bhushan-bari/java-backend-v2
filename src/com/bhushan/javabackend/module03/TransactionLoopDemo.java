package com.bhushan.javabackend.module03;

public class TransactionLoopDemo {

    public static void main(String[] args) {

        int balance = 50000;

        int[] transactions = {5000, 3000, 7500, 2000, 4000};

        for (int i = 0; i < transactions.length; i++) {

            System.out.println("Transaction " + (i + 1) + ": â‚¹" + transactions[i]);

            balance = balance - transactions[i];

            System.out.println("Remaining Balance: â‚¹" + balance);
            System.out.println();
        }

        System.out.println("Final Balance: â‚¹" + balance);
    }
}
