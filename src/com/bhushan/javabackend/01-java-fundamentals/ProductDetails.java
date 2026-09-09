package com.bhushan.javabackend;

public class ProductDetails {

    public static void main(String[] args) {

        int productId = 501;
        String productName = "Laptop";
        double price = 65000.00;
        int quantity = 2;
        boolean available = true;

        double totalAmount = price * quantity;

        System.out.println("===== Product Details =====");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Available: " + available);
        System.out.println("Total Amount: ₹" + totalAmount);
    }
}