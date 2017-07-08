package com.example.user.blackjackandroidproject;

/**
 * Created by user on 07/07/2017.
 */

public class Player {
    // every time we new up a player we give them a hand.
    Hand hand;


    public Player(){
        hand = new Hand();
    }

    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    public Hand showHand(){
        return this.hand;
    }
}
