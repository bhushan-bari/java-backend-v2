package com.bhushan.javabackend.module02;

public class StringMethodsDemo {

    public static void main(String[] args) {

        String accountNumber = "  SBIN001234567890  ";

        String cleanedAccountNumber = accountNumber.trim();

        System.out.println("Original: [" + accountNumber + "]");
        System.out.println("Trimmed: [" + cleanedAccountNumber + "]");

        System.out.println(
                "Starts with SBI: "
                        + cleanedAccountNumber.startsWith("SBI")
        );

        System.out.println(
                "Ends with 890: "
                        + cleanedAccountNumber.endsWith("890")
        );

        System.out.println(
                "Character at index 0: "
                        + cleanedAccountNumber.charAt(0)
        );

        System.out.println(
                "Contains 1234: "
                        + cleanedAccountNumber.contains("1234")
        );

        System.out.println(
                "Replaced account number: "
                        + cleanedAccountNumber.replace("1234", "XXXX")
        );
    }
}
