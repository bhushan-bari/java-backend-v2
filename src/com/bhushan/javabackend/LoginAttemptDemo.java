package com.bhushan.javabackend;

public class LoginAttemptDemo {

    public static void main(String[] args) {

        int attempts = 0;
        int maxAttempts = 3;
        boolean loginSuccessful = false;

        while (attempts < maxAttempts && !loginSuccessful) {

            attempts++;

            System.out.println("Login attempt: " + attempts);

            if (attempts == 3) {
                loginSuccessful = true;
            }
        }

        if (loginSuccessful) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Account locked after " + maxAttempts + " attempts.");
        }
    }
}