package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 18/03/2017.
 */

public class LoyaltyDiscount {

    public static double calculateDiscount(Customer customer, double subTotal) {
        return customer.getLoyaltyCard() == null ?
                0 :
                subTotal / 100.00 * customer.getLoyaltyCard().getDiscountRate();
    }
}
