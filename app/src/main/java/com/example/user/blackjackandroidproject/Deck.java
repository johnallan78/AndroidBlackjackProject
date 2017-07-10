package com.example.user.blackjackandroidproject;

import java.util.ArrayList;
import java.util.Collections;



/**
 * Created by user on 07/07/2017.
 */

public class Deck {

    ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
        populate();
        shuffle();
    }

    public void populate(){
    for (Pics pic : Pics.values()){
    cards.add(new Card(pic));
    }
 }

    public Card getCard(){
        return cards.remove(0);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
}
