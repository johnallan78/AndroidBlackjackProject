package com.example.user.blackjackandroidproject;

import java.util.ArrayList;

/**
 * Created by user on 07/07/2017.
 */

public class Hand {

    ArrayList<Card> cards;


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

    public Card showThirdCard(){
        return cards.get(2);
    }


}
