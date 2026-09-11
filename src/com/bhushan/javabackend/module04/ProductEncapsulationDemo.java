package com.bhushan.javabackend.module04;

class EncapsulatedProduct {

    private int productId;
    private String productName;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }
}

public class ProductEncapsulationDemo{

    public static void main(String[] args) {

        EncapsulatedProduct product = new EncapsulatedProduct();

        product.setProductId(101);
        product.setProductName("Laptop");
        product.setPrice(70000);

        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Price: " + product.getPrice());

        System.out.println();

        product.setPrice(-5000);

        System.out.println(
                "Price after invalid update: " + product.getPrice()
        );
    }
}
