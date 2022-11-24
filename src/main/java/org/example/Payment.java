package org.example;

public class Payment {
    public int TotalPrice;


    public Payment() {
        TotalPrice = 0;
    }

    public int MakePayment(int totalPrice){
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Payment Done");
        return totalPrice;
    }
}
