package com.bhushan.javabackend.module08;

interface PaymentMethod {

    void pay(double amount);

    default void printReceipt() {
        System.out.println("Receipt generated");
    }

    static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}

class CardPaymentMethod implements PaymentMethod {

    private String cardHolderName;

    public CardPaymentMethod(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println(
                "Payment of " + amount
                        + " completed for "
                        + cardHolderName
        );
    }
}

public class PaymentMethodDemo {

    public static void main(String[] args) {

        CardPaymentMethod payment =
                new CardPaymentMethod("Bhushan");

        if (PaymentMethod.isValidAmount(1000)) {

            payment.pay(1000);

            payment.printReceipt();
        }
    }
}