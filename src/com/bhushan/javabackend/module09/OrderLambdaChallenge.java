package com.bhushan.javabackend.module09;

class Order {

    private String orderId;
    private double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }
}

@FunctionalInterface
interface OrderRule {

    boolean check(Order order);
}

public class OrderLambdaChallenge {

    public static void main(String[] args) {

        Order order1 =
                new Order("ORD101", 400);

        Order order2 =
                new Order("ORD102", 800);

        Order order3 =
                new Order("ORD103", 2500);

        OrderRule freeDelivery =
                order -> order.getAmount() >= 500;

        OrderRule premiumHandling =
                order -> order.getAmount() >= 2000;

        checkOrder(order1, freeDelivery, premiumHandling);
        checkOrder(order2, freeDelivery, premiumHandling);
        checkOrder(order3, freeDelivery, premiumHandling);
    }

    private static void checkOrder(
            Order order,
            OrderRule freeDelivery,
            OrderRule premiumHandling) {

        System.out.println(
                "Order: " + order.getOrderId()
        );

        System.out.println(
                "Free Delivery: "
                        + freeDelivery.check(order)
        );

        System.out.println(
                "Premium Handling: "
                        + premiumHandling.check(order)
        );

        System.out.println();
    }
}