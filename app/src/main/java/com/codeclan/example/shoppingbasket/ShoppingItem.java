package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 17/03/2017.
 */

class ShoppingItem {
    private String name;
    private double price;

    public ShoppingItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

