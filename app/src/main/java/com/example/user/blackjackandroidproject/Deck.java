package com.example.user.blackjackandroidproject;

import java.util.ArrayList;
import java.util.Collections;

import static com.example.user.blackjackandroidproject.Rank.ACE;
import static com.example.user.blackjackandroidproject.Rank.EIGHT;
import static com.example.user.blackjackandroidproject.Rank.FIVE;
import static com.example.user.blackjackandroidproject.Rank.FOUR;
import static com.example.user.blackjackandroidproject.Rank.NINE;
import static com.example.user.blackjackandroidproject.Rank.SEVEN;
import static com.example.user.blackjackandroidproject.Rank.SIX;
import static com.example.user.blackjackandroidproject.Rank.TEN;
import static com.example.user.blackjackandroidproject.Rank.THREE;
import static com.example.user.blackjackandroidproject.Rank.TWO;
import static com.example.user.blackjackandroidproject.Suit.CLUBS;

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
        // use for loops to iterate through suit and rank. Use nested loops. Use values() method.
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cards.add(new Card(rank, suit)); //  create new instance of Card and add it to the array.
            }
        }
    }

    public Card getCard(){
        return cards.remove(0);
    }

    public void shuffle(){
        Collections.shuffle(cards); // inbuilt class on which shuffle() can be called
    }
}
