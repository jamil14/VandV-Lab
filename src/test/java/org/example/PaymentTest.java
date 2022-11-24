package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    void makePayment() {
        Customer customer1 = new Customer("jamil");
        Products product1 = new Products("ball", "sports", 1500);
        Products product2 = new Products("bat", "sports", 700);

        customer1.AddToCart(product1);
        customer1.AddToCart(product2);

        assertEquals(2200, customer1.payment.MakePayment(customer1.cart.SumTotalPrice()));
    }
}