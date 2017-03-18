package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class SpendDiscountTest {

    @Test
    public void testEligbleSpendDiscount() {
        assertEquals(2.00, SpendDiscount.calculateDiscount(20.01), 0.01);
    }
}
