package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

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
    public void testNumOfItemsInEmptyBasket() {
        assertEquals(0, basket.getNumOfItemsOfBasket());
    }

    @Test
    public void testAddItemToBasketIncreasesCount() {
        basket.addToBasket(item);
        assertEquals(1, basket.getNumOfItemsOfBasket());
    }

    @Test
    public void testAddItemToBasketIncreasesTotal() {
        basket.addToBasket(item);
    }

    @Test
    public void testAddingMultipleItemsToBasket() {
        basket.addToBasket(item);
        basket.addToBasket(item);
        assertEquals(2, basket.getNumOfItemsOfBasket());
    }

    @Test
    public void testCanEmptyBasket() {
        basket.addToBasket(item);
        basket.addToBasket(item);
        assertEquals(2, basket.getNumOfItemsOfBasket());
        basket.emptyBasket();
        assertEquals(0, basket.getNumOfItemsOfBasket());
    }

    @Test
    public void testCanRemoveSingleItemFromBasket() {
        basket.addToBasket(item);
        basket.addToBasket(item);
        basket.removeItem(item);
        assertEquals(1, basket.getNumOfItemsOfBasket());
    }
}
