package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    static Admin admin;
    static Guest guest;


    @BeforeAll
    static void init(){
        admin = new Admin("Admin");
        guest = new Guest();

        admin.AddProducts("ball", "stationery", 10);
        admin.AddProducts("bat", "stationery", 150);

    }

    @Test
    void viewProducts() {

        assertEquals(2, guest.ViewProducts(admin).size());
        assertEquals("ball", guest.ViewProducts(admin).get(0).Name);
    }

    @Test
    void getRegistered() {
        guest.GetRegistered("jamil");
        assertEquals("jamil", guest.GetRegistered("noor").Name);
    }
}