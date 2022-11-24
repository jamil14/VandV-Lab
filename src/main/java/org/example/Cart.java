package org.example;

import java.util.ArrayList;

public class Cart {
    private int Price;
    private int TotalPrice;

    public ArrayList<Products> cartItems = new ArrayList<Products>();




    public void AddToCart(Products product){
        cartItems.add(product);
    }

    public void DeleteFromCart(int id){
        cartItems.remove(id);
    }

    public ArrayList<Products> ViewCart(){
        System.out.println("Cart Items:");
        for (Products product : cartItems) {
            System.out.println(product.Name + " " + product.Group+ " " + product.Price);
        }
        return cartItems;
    }
    public int SumTotalPrice (){
        int sum = 0;
        for (Products product : cartItems) {
            sum += product.Price;
        }
        return sum;
    }
}
