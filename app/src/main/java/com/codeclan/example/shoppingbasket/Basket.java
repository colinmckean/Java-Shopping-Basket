package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 17/03/2017.
 */

class Basket {
    private double subTotal;
    private ArrayList<ShoppingItem> itemsInCart = new ArrayList<>();

    public double getSubTotal() {
        subTotal = 0;
        for (ShoppingItem i : itemsInCart) subTotal += i.getPrice();
        return subTotal;
    }
}
