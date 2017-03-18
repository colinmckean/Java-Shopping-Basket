package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class LoyaltyDiscountTest {

    @Test
    public void testLoyaltyDiscount(){
        assertEquals(0.26, LoyaltyDiscount.calculateDiscount(13.00), 0.01);
    }

    @Test
    public void testNonEligbleSpendDiscount() {
        assertEquals(0.00, SpendDiscount.calculateDiscount(19.01), 0.01);
    }
}
