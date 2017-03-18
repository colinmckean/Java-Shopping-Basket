package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 18/03/2017.
 */

class Customer {
    private LoyaltyCard loyaltyCard;

    public Customer(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public Customer() {
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }
}
