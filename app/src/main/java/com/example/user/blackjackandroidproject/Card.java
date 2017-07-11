package com.example.user.blackjackandroidproject;

/**
 * Created by user on 07/07/2017.
 */

public class Card {
    Pics pic;

    public Card(Pics pic){
        this.pic = pic;
    }

    public int cardValue() {
        return this.pic.getValue(); // using getter from the enum
    }

    public int cardPic(){
        return this.pic.getPic();
    }

}
