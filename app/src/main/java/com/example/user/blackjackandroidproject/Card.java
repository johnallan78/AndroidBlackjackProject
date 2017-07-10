package com.example.user.blackjackandroidproject;

/**
 * Created by user on 07/07/2017.
 */

public class Card {
    Rank rank;
    Suit suit;
    Pics pic;

    // Obviously, each instance of a card must have a rank and a suit.

    public Card(Pics pic){
        this.pic = pic;
    }



//  KEEP THIS CONSTRUCTOR!
//    public Card(Rank valueOfCard, Suit suitOfCard) {
//        this.rank = valueOfCard;
//        this.suit = suitOfCard;
//
//    }

    public int cardValue() {
        return this.pic.getValue(); // using getter from the enum
    }
//   KEEP THIS METHOD!
//    public int cardValue() {
//        return this.rank.getValue(); // using getter from the enum
//    }


    public String cardName(){
        return this.pic.getName();
    }
//  KEEP THIS METHOD!
//    public String cardName() {
//        return this.rank + " of " + this.suit;
//    }

    public int cardPic(){
        return this.pic.getPic();
    }

}
