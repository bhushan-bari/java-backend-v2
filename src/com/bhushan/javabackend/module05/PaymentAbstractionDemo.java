package com.bhushan.javabackend.module05;

abstract class Payment {

    private String transactionId;

    public Payment(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void showTransaction() {
        System.out.println("Transaction ID: " + transactionId);
    }

    public abstract void pay();
}

class CardPayment extends Payment {

    public CardPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public void pay() {
        System.out.println("Payment completed using Card");
    }
}

class UpiPayment extends Payment {

    public UpiPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public void pay() {
        System.out.println("Payment completed using UPI");
    }
}

public class PaymentAbstractionDemo {

    public static void main(String[] args) {


        CardPayment cardPayment =
                new CardPayment("TXN101");

        cardPayment.showTransaction();
        cardPayment.pay();

        System.out.println();

        UpiPayment upiPayment =
                new UpiPayment("TXN102");

        upiPayment.showTransaction();
        upiPayment.pay();
    }
}