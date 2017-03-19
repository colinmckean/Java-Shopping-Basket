package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 18/03/2017.
 */

public class SpendDiscount {

    public static double calculateDiscount(double subTotal) {
        return subTotal > 20.00 ? subTotal / 10.00 : 0.0;
    }
}

