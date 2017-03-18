package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class BuyOneGetOneFreeDiscountTest {
    Basket basket;
    ShoppingItem item;
    ArrayList<ShoppingItem> testCart;

    @Before
    public void before() {
        basket = new Basket();
        testCart = new ArrayList<>();
        item = new ShoppingItem("bacon", 10.99f);
    }

    @Test
    public void testOddMultiBuyCalculateDiscount() {
        testCart.add(item);
        testCart.add(item);
        testCart.add(item);
        assertEquals(10.99, BuyOneGetOneFreeDiscount.calculateDiscount(testCart), 0.01);
    }
}
