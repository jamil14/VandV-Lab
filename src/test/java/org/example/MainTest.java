package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static Admin admin;


    @BeforeAll
    static void init(){
        admin = new Admin("New Admin");

        admin.AddProducts("football", "sports", 700);
        admin.AddProducts("bat", "sports", 500);


    }


    @Test
    void main() {
        assertEquals(2, admin.productItems.size());

        assertEquals("football", admin.productItems.get(0).Name);
        assertEquals("sports", admin.productItems.get(0).Group);
        assertEquals(4, admin.productItems.get(0).Id);
        assertEquals(700, admin.productItems.get(0).Price);
    }
}