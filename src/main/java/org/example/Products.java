package org.example;

public class Products {
    static int productCount = 1;
    public int Id;
    public int Price;
    public String Name;
    public String Group;


    public Products(String name, String group, int price) {
        Id = productCount;
        Name = name;
        Group = group;
        Price = price;
        productCount++;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
