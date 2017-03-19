package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 18/03/2017.
 */

public class Checkout {
    private double total;
    private ArrayList<ShoppingItem> itemsInBasket = new ArrayList<>();

    public double getTotal(Customer customer, Basket basket) {
        this.itemsInBasket = basket.getBasketList();
        total = getSubTotal();
        total -= BuyOneGetOneFreeDiscount.calculateDiscount(basket);
        total -= SpendDiscount.calculateDiscount(total);
        total -= LoyaltyDiscount.calculateDiscount(customer, total);
        return total;
    }

    private double getSubTotal() {
        double subTotal = 0;
        for (ShoppingItem i : itemsInBasket) subTotal += i.getPrice();
        return subTotal;
    }
}
