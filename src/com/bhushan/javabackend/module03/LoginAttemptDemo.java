package com.bhushan.javabackend.module03;

public class LoginAttemptDemo {

    public static void main(String[] args) {

        int correctPin = 1234;

        int[] pinAttempts = {1111, 2222, 1234};

        int attempt = 0;
        boolean loginSuccessful = false;

        while (attempt < 3 && !loginSuccessful) {

            int enteredPin = pinAttempts[attempt];

            if (enteredPin == correctPin) {

                System.out.println("Attempt " + (attempt + 1) + ": Login Successful");

                loginSuccessful = true;

            } else {

                System.out.println("Attempt " + (attempt + 1) + ": Invalid PIN");
            }

            attempt++;
        }

        if (!loginSuccessful) {
            System.out.println("Account Locked");
        }
    }
}
