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




    public ArrayList<Card> showHand() {
        return cards;
    }

    public Integer getHandValue(){
        int total = 0;
        for (Card card : cards){
            total += card.cardValue();
        }
        return total;
    }
}
