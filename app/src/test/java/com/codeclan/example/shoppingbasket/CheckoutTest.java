package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class CheckoutTest {
    Customer nonLoyalCustomer;
    Customer loyalCustomer;
    Basket basket;
    ShoppingItem beans;
    ShoppingItem newsPaper;
    @Before
    public void before(){
        nonLoyalCustomer = new Customer();
        loyalCustomer = new Customer();
        basket = new Basket();
        beans = new ShoppingItem("beans", 19.50);
        newsPaper = new ShoppingItem("beans", 19.50);
    }

    @Test
    public void testSingleItemUnderSpendNonLoyalCustomer(){
        basket.addToBasket(beans);
        Checkout.getTotal(nonLoyalCustomer, basket);
        assertEquals(19,50, Checkout.getTotal(nonLoyalCustomer, basket));
    }

}
