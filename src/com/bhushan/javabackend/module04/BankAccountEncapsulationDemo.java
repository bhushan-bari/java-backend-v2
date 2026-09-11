package com.bhushan.javabackend.module04;

class EncapsulatedBankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public EncapsulatedBankAccount(String accountNumber,
                                   String accountHolderName,
                                   double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }
}

public class BankAccountEncapsulationDemo {

    public static void main(String[] args) {

        EncapsulatedBankAccount account =
                new EncapsulatedBankAccount(
                        "ACC101",
                        "Bhushan",
                        10000
                );

        System.out.println("Account Number: "
                + account.getAccountNumber());

        System.out.println("Account Holder: "
                + account.getAccountHolderName());

        System.out.println("Initial Balance: "
                + account.getBalance());

        System.out.println();

        account.deposit(2000);

        account.withdraw(3000);

        System.out.println();

        System.out.println("Final Balance: "
                + account.getBalance());

        System.out.println();

        account.deposit(-500);

        account.withdraw(20000);
    }
}