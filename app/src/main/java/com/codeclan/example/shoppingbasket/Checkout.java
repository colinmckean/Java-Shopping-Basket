package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 18/03/2017.
 */

public class Checkout {
    private double total;
    public double getTotal(Customer customer, Basket basket) {
        total = basket.getSubTotal();
        total -= BuyOneGetOneFreeDiscount.calculateDiscount(basket);
        total -= SpendDiscount.calculateDiscount(total);
        total -= LoyaltyDiscount.calculateDiscount(customer,total);
        return total;
    }
}
