package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class CartTest {

    static Cart cart;
    static Cart cart2;
    static Products product1;
    static Products product2;
    static Products product3;

    @BeforeAll
    static void init(){
        cart = new Cart();
        product1 = new Products("football", "sports", 1500);
        product2 = new Products("cricket ball", "sports", 700);
        product3 = new Products("cricket bat", "sports", 500);

        cart.AddToCart(product1);
        cart.AddToCart(product2);
        cart.AddToCart(product3);
    }

    @Test
    void addToCart() {

        assertEquals(3, cart.cartItems.size());
        assertEquals("football", cart.cartItems.get(0).Name);
        assertEquals("sports", cart.cartItems.get(0).Group);
        assertEquals(1500, cart.cartItems.get(0).Price);
    }

    @Test
    void deleteFromCard() {

        assertEquals(3, cart.cartItems.size());

        cart.DeleteFromCart(1);
        assertEquals(2, cart.cartItems.size());
        assertEquals("football", cart.cartItems.get(0).Name);
        assertEquals("sports", cart.cartItems.get(0).Group);
        assertEquals(1500, cart.cartItems.get(0).Price);
    }

    @Test
    void viewCart() {
        cart2 = new Cart();
        cart2.AddToCart(product1);
        cart2.AddToCart(product2);
        cart2.AddToCart(product3);


        assertEquals(3, cart2.cartItems.size());


        assertEquals("pant", cart2.cartItems.get(0).Name);
        assertEquals("sports", cart2.cartItems.get(0).Group);
        assertEquals(1500, cart2.cartItems.get(0).Price);

        assertEquals("cricket bat", cart2.cartItems.get(2).Name);
        assertEquals("sports", cart2.cartItems.get(2).Group);
        assertEquals(500, cart2.cartItems.get(2).Price);

        assertSame(cart2.cartItems, cart2.ViewCart());
    }

    @Test
    void sumTotalPrice() {

        assertEquals(2000, cart.SumTotalPrice());
    }

    @Test
    void makePayment() {
        cart2 = new Cart();
        cart2.AddToCart(product1);
        cart2.AddToCart(product2);
        assertEquals(2200, cart2.SumTotalPrice());
    }
}