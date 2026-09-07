package com.bhushan.javabackend;

public class BankMenuDemo {

    public static void main(String[] args) {

        int option = 3;

        switch (option) {
            case 1:
                System.out.println("Balance Enquiry");
                break;

            case 2:
                System.out.println("Cash Withdrawal");
                break;

            case 3:
                System.out.println("Fund Transfer");
                break;

            case 4:
                System.out.println("Mini Statement");
                break;

            case 5:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}