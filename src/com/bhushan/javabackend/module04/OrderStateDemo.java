package com.bhushan.javabackend.module04;
class Order{
    int orderId;
    String customerName;
    double totalAmount;

    Order(int orderId,String customerName,double totalAmount){
        this.orderId=orderId;
        this.customerName=customerName;
        this.totalAmount=totalAmount;
    }
    void displayOrder(){
        System.out.println("Order ID: " +orderId);
        System.out.println("Customer : " +customerName);
        System.out.println("Total Amount: " +totalAmount);
        System.out.println();
    }
}
public class OrderStateDemo {
    public static void main(String[] args) {
        Order order1=new Order(101,"Rahul",800.0);
        Order order2=new Order(102,"Priya",1800.0);

        order1.displayOrder();
        order2.displayOrder();
    }
}
