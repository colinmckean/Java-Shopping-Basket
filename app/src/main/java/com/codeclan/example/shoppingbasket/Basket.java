package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 17/03/2017.
 */

class Basket {
    private double subTotal;
    private ArrayList<ShoppingItem> itemsInBasket = new ArrayList<>();

    public double getSubTotal() {
        subTotal = 0;
        for (ShoppingItem i : itemsInBasket) subTotal += i.getPrice();
        return subTotal;
    }

    public int getNumOfItemsOfBasket() {
        return itemsInBasket.size();
    }

    public void addToBasket(ShoppingItem item) {
        itemsInBasket.add(item);
    }

    public void emptyBasket() {
        itemsInBasket.clear();
    }

    public void removeItem(ShoppingItem item) {
        itemsInBasket.remove(item);
    }
}
