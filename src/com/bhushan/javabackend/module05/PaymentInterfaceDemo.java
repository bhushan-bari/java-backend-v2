package com.bhushan.javabackend.module05;

interface PaymentMethod {

    void pay();
}

class CardPaymentMethod implements PaymentMethod {

    private String transactionId;

    public CardPaymentMethod(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public void pay() {
        System.out.println(
                "Card payment completed: " + getTransactionId()
        );
    }
}

class UpiPaymentMethod implements PaymentMethod {

    private String transactionId;

    public UpiPaymentMethod(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public void pay() {
        System.out.println(
                "UPI payment completed: " + getTransactionId()
        );
    }
}

class WalletPaymentMethod implements PaymentMethod {

    private String transactionId;

    public WalletPaymentMethod(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public void pay() {
        System.out.println(
                "Wallet payment completed: " + getTransactionId()
        );
    }
}

public class PaymentInterfaceDemo {

    public static void main(String[] args) {

        CardPaymentMethod card =
                new CardPaymentMethod("TXN101");

        card.pay();

        UpiPaymentMethod upi =
                new UpiPaymentMethod("TXN102");

        upi.pay();

        WalletPaymentMethod wallet =
                new WalletPaymentMethod("TXN103");

        wallet.pay();
    }
}