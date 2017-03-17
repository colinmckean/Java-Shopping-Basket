package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class BasketTest {
    Basket basket;
    ShoppingItem item;

    @Before
    public void before() {
        basket = new Basket();
        item = new ShoppingItem("eggs", 15.99f);
    }

    @Test
    public void testEmptyBasketTotal() {
        assertEquals(0, basket.getSubTotal(), 0.01);
    }

    @Test
    public void testNumOfItemsInEmptyBasket() {
        assertEquals(0, basket.getNumOfItemsOfBasket());
    }
    @Test
    public void testAddItemToBasketIncreasesCount(){
        basket.addToBasket(item);
        assertEquals(1, basket.getNumOfItemsOfBasket());
    }
    @Test
    public void testAddItemToBasketIncreasesTotal(){
        basket.addToBasket(item);
        assertEquals(15.99, basket.getSubTotal(), 0.01);
    }
    @Test
    public void testAddingMultipleItemsToBasket(){
        basket.addToBasket(item);
        basket.addToBasket(item);
        assertEquals(31.98, basket.getSubTotal(), 0.01);
        assertEquals(2, basket.getNumOfItemsOfBasket());
    }

    @Test
    public void testCanEmptyBasket(){
        basket.addToBasket(item);
        basket.addToBasket(item);
        assertEquals(31.98, basket.getSubTotal(), 0.01);
        assertEquals(2, basket.getNumOfItemsOfBasket());
        basket.emptyBasket();
        assertEquals(0, basket.getNumOfItemsOfBasket());
        assertEquals(0, basket.getSubTotal(), 0.01);
    }
}
