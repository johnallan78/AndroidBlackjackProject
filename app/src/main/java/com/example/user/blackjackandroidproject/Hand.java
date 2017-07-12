package com.example.user.blackjackandroidproject;

import java.util.ArrayList;

/**
 * Created by user on 07/07/2017.
 */

public class Hand {

    ArrayList<Card> cards;

    // This is where alot of the running of the game takes place.
    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card showFirstCard() {
        return cards.get(0);
    }

    public Card showSecondCard() {
        return cards.get(1);
    }

}
