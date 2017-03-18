package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class LoyaltyDiscountTest {
    Customer nonLoyalCustomer;
    LoyaltyCard loyaltyCard;
    Customer loyalCustomer;

    @Before
    public void before() {
        nonLoyalCustomer = new Customer();
        loyaltyCard = new LoyaltyCard(2);
        loyalCustomer = new Customer(loyaltyCard);
    }

    @Test
    public void testLoyaltyDiscount() {
        assertEquals(0.26, LoyaltyDiscount.calculateDiscount(loyalCustomer, 13.00), 0.01);
    }

    @Test
    public void testNonLoyalDiscount() {
        assertEquals(0, LoyaltyDiscount.calculateDiscount(nonLoyalCustomer, 13.00), 0.01);
    }
}
