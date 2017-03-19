package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Created by user on 18/03/2017.
 */

public class BuyOneGetOneFreeDiscount {
    private static HashMap<ShoppingItem, Integer> itemCount;
    private static double discountAmount;

    public static double calculateDiscount(Basket basket) {
        discountAmount = 0;
        checkEligibleItems(basket.getBasket());
        calculateDiscountAmount();
        return discountAmount;
    }

    private static void checkEligibleItems(ArrayList<ShoppingItem> itemsInCart) {
        itemCount = new HashMap<>();

        for (ShoppingItem i : itemsInCart) {
            if (itemCount.containsKey(i)) {
                itemCount.put(i, itemCount.get(i) + 1);
            } else {
                itemCount.put(i, 1);
            }
        }
    }

    private static void calculateDiscountAmount() {
        for (Entry<ShoppingItem, Integer> entry : itemCount.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                discountAmount += entry.getKey().getPrice() * entry.getValue() / 2;
            } else if ((entry.getValue() - 1) % 2 == 0) {
                discountAmount += entry.getKey().getPrice() * (entry.getValue() - 1) / 2;
            }
        }
    }

}
