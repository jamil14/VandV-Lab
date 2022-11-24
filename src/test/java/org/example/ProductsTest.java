package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    static Products product1;
    static Products product2;

    @BeforeAll
    static void init(){
        product1 = new Products("football", "sports", 500);
        product2 = new Products("bat", "sports", 1500);
    }


    @Test
    void setId() {
        product1.setId(1);
        assertEquals(1, product1.Id);
    }

    @Test
    void setName() {
        product1.setName("ball");
        assertEquals("ball", product1.Name);
    }

    @Test
    void setGroup() {
        product2.setGroup("sports");
        assertEquals("sports", product2.Group);
    }

    @Test
    void setPrice() {
        product1.setPrice(1800);
        assertEquals(1800, product1.Price);
    }
}