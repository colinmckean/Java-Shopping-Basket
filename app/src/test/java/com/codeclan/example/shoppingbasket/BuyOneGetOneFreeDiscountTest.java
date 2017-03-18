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
    ShoppingItem itemTwo;
//    BuyOneGetOneFreeDiscount bogofDiscount;

    @Before
    public void before() {
        basket = new Basket();
//        bogofDiscount = new BuyOneGetOneFreeDiscount();
        item = new ShoppingItem("bacon", 10.99f);
        itemTwo = new ShoppingItem("eggs", 5.99f);
    }

    @Test
    public void testOddMultiBuyCalculateDiscount() {
        basket.emptyBasket();
        basket.addToBasket(item);
        basket.addToBasket(item);
        basket.addToBasket(item);
        assertEquals(10.99, BuyOneGetOneFreeDiscount.calculateDiscount(basket), 0.01);
    }

    @Test
    public void testEvenMultiBuyCalculateDiscount() {
        basket.addToBasket(item);
        basket.addToBasket(item);
        basket.addToBasket(item);
        basket.addToBasket(item);
        assertEquals(21.98, BuyOneGetOneFreeDiscount.calculateDiscount(basket), 0.01);
    }

    @Test
    public void testMultiBuyWithDifferentItems() {
        basket.emptyBasket();
        basket.addToBasket(item);
        basket.addToBasket(item);
        basket.addToBasket(itemTwo);
        basket.addToBasket(itemTwo);
        assertEquals(16.98, BuyOneGetOneFreeDiscount.calculateDiscount(basket), 0.01);
    }
}
