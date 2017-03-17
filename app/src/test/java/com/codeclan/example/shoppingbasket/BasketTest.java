package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class BasketTest {
    Basket basket;

    @Before
    public void before() {
        basket = new Basket();
    }

    @Test
    public void testEmptyBasketTotal() {
        assertEquals(0, basket.getTotal());
    }
}
