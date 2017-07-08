package com.example.user.blackjackandroidproject;

import static android.R.attr.value;

/**
 * Created by user on 07/07/2017.
 */

public enum Suit {
    CLUBS("c"),
    SPADES("s"),
    HEARTS("h"),
    DIAMONDS("d");

    String value;
    Suit(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
