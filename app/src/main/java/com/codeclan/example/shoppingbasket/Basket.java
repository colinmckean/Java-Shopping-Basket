package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 17/03/2017.
 */

class Basket {
    private ArrayList<ShoppingItem> itemsInBasket = new ArrayList<>();

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

    public ArrayList<ShoppingItem> getBasketList() {
        return new ArrayList<>(itemsInBasket);
    }
}
