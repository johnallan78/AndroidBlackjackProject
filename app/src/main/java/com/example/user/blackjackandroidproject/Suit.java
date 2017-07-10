package com.example.user.blackjackandroidproject;

import static android.R.attr.value;

/**
 * Created by user on 07/07/2017.
 */

public enum Suit {
    CLUBS("Clubs"),
    SPADES("Spades"),
    HEARTS("Hearts"),
    DIAMONDS("Diamonds");

    String value;
    Suit(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
