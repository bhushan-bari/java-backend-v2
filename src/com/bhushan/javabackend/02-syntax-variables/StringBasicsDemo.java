package com.bhushan.javabackend;

public class StringBasicsDemo {

    public static void main(String[] args) {

        String bankName = "Bank of India";
        String accountType = "Savings";

        System.out.println("Bank: " + bankName);
        System.out.println("Account Type: " + accountType);

        System.out.println("Length: " + bankName.length());
        System.out.println("Uppercase: " + bankName.toUpperCase());
        System.out.println("Lowercase: " + bankName.toLowerCase());
        System.out.println("Contains SBI: " + bankName.contains("SBI"));
    }
}