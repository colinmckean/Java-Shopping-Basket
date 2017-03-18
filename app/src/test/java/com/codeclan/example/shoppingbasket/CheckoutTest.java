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
    Checkout checkout;
    LoyaltyCard loyaltyCard;
    Basket basket;
    ShoppingItem beans;
    ShoppingItem newsPaper;
    ShoppingItem cheese;
    ShoppingItem hotdogs;

    @Before
    public void before() {
        nonLoyalCustomer = new Customer();
        loyaltyCard = new LoyaltyCard(2);
        loyalCustomer = new Customer(loyaltyCard);
        checkout = new Checkout();
        basket = new Basket();
        beans = new ShoppingItem("beans", 19.50);
        newsPaper = new ShoppingItem("beans", 19.50);
        cheese = new ShoppingItem("cheese", 3.99);
        hotdogs = new ShoppingItem("hotdogs", 6.99);
    }

    @Test
    public void testSingleItemUnderSpendNonLoyalCustomer() {
        basket.addToBasket(beans);
        assertEquals(19.50, checkout.getTotal(nonLoyalCustomer, basket), 0.01);
    }

    @Test
    public void testMultiBuyDiscount() {
        basket.addToBasket(cheese);
        basket.addToBasket(cheese);
        assertEquals(3.99, checkout.getTotal(nonLoyalCustomer, basket), 0.01);
    }

    @Test
    public void testSingleItemUnderSpendLoyalCustomer() {
        basket.addToBasket(beans);
        assertEquals(19.11, checkout.getTotal(loyalCustomer, basket), 0.01);
    }

    @Test
    public void testMultiBuyUnderSpendLoyalCustomer() {
        basket.addToBasket(beans);
        basket.addToBasket(beans);
        assertEquals(19.11, checkout.getTotal(loyalCustomer, basket), 0.01);
    }

    @Test
    public void testMultiBuyUnderSpendLoyalCustomerMixedItems() {
        basket.addToBasket(cheese);
        basket.addToBasket(cheese);
        basket.addToBasket(hotdogs);
        assertEquals(10.76, checkout.getTotal(loyalCustomer, basket), 0.01);
    }

    @Test
    public void testEligibleSpendLoyalCustomer() {
        basket.addToBasket(beans);
        basket.addToBasket(hotdogs);
        assertEquals(23.36, checkout.getTotal(loyalCustomer, basket), 0.01);
    }

    @Test
    public void testMultiBuyEligbleSpendLoyalCustomer() {
        basket.addToBasket(beans);
        basket.addToBasket(newsPaper);
        basket.addToBasket(newsPaper);
        assertEquals(34.39, checkout.getTotal(loyalCustomer, basket), 0.01);
    }
}
