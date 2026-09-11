package com.bhushan.javabackend.module04;

class FoodDeliveryOrder {

    private int orderId;
    private String customerName;
    private String restaurantName;
    private double totalAmount;
    private String status;

    FoodDeliveryOrder(int orderId,
                      String customerName,
                      String restaurantName,
                      double totalAmount,
                      String status) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public void displayOrder() {

        System.out.println("Order ID       : " + this.orderId);
        System.out.println("Customer       : " + this.customerName);
        System.out.println("Restaurant     : " + this.restaurantName);
        System.out.println("Total Amount   : " + this.totalAmount);
        System.out.println("Status         : " + this.status);
        System.out.println();
    }

    public void updateStatus(String status) {

        this.status = status;

        System.out.println(
                "Order " + this.orderId +
                        " status updated to " + this.status
        );
    }

    public void applyDiscount(double percentage) {

        if (percentage > 0 && percentage <= 50) {

            double discount =
                    this.totalAmount * percentage / 100;

            this.totalAmount =
                    this.totalAmount - discount;

            System.out.println(
                    percentage + "% discount applied to Order "
                            + this.orderId
            );

        } else {

            System.out.println("Invalid discount");
        }
    }
}

public class FoodDeliveryOrderDemo {

    public static void main(String[] args) {

        FoodDeliveryOrder order1 =
                new FoodDeliveryOrder(
                        1001,
                        "Rahul",
                        "Pizza Palace",
                        800,
                        "PLACED"
                );

        FoodDeliveryOrder order2 =
                new FoodDeliveryOrder(
                        1002,
                        "Priya",
                        "Burger House",
                        1200,
                        "PLACED"
                );

        System.out.println("INITIAL ORDERS");
        System.out.println("----------------");

        order1.displayOrder();
        order2.displayOrder();

        order1.updateStatus("CONFIRMED");

        order2.applyDiscount(10);

        System.out.println();
        System.out.println("UPDATED ORDERS");
        System.out.println("----------------");

        order1.displayOrder();
        order2.displayOrder();
    }
}