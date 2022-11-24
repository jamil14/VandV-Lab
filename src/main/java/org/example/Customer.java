package org.example;

import java.util.ArrayList;

public class Customer {
    static int customerCount = 1;
    private int CustomerId;
    public String Name;

    public Cart cart;
    public Payment payment;

    public Customer(String name) {
        CustomerId = customerCount;
        Name = name;
        customerCount++;
        cart = new Cart();
        payment = new Payment();
    }



    public ArrayList<Products> ViewCartProducts(){

        return cart.ViewCart();
    }

    public void AddToCart(Products product){

        cart.AddToCart(product);
    }

    public void DeleteFromCart(int id){
        cart.DeleteFromCart(id);
    }
}
