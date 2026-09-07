package com.bhushan.javabackend;

public class BankAccountEligibility {

    public static void main(String[] args) {

        int age = 25;
        boolean hasValidKyc = true;
        double monthlyIncome = 45000;

        if (age >= 18 && hasValidKyc && monthlyIncome >= 25000) {
            System.out.println("Customer is eligible for premium account.");
        } else if (age >= 18 && hasValidKyc) {
            System.out.println("Customer is eligible for regular account.");
        } else {
            System.out.println("Customer is not eligible for account opening.");
        }
    }
}