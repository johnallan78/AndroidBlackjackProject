package com.example.user.blackjackandroidproject;

import static android.R.attr.value;

/**
 * Created by user on 07/07/2017.
 */

public enum Rank {
    ACE(11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    Integer value;
    Rank(int value){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
