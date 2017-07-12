package com.example.user.blackjackandroidproject;

/**
 * Created by user on 07/07/2017.
 */

public class Card {
    Pics pic;

    // each card when instantiated is passed in an Enum which contains the value of the card and a
    // picture of the card. The suit of the card does not require to be passed in, as it will be
    // visible on screen in the app.
    public Card(Pics pic){
        this.pic = pic;
    }

    public int cardValue() {
        return this.pic.getValue();
    }

    public int cardPic(){
        return this.pic.getPic();
    }

}
