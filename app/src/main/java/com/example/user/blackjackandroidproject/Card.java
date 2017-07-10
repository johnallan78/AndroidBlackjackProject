package com.example.user.blackjackandroidproject;

/**
 * Created by user on 07/07/2017.
 */

public class Card {
    Rank rank;
    Suit suit;
    int img;

    // Obviously, each instance of a card must have a rank and a suit.



    public Card(Rank valueOfCard, Suit suitOfCard, int img) {
        this.rank = valueOfCard;
        this.suit = suitOfCard;
        this.img = img;

    }

    public int cardValue() {
        return this.rank.getValue(); // using getter from the enum
    }

    public String cardName(){
        return  this.rank.getValue() + " of " + this.suit.getValue() ;
    }

    public int getImg() {
        return img;
    }
}
