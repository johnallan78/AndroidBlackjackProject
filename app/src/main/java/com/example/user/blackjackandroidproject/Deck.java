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
//        R.drawable.ace_clubs
        cards.add(new Card(ACE, CLUBS, R.drawable.c1));
        cards.add(new Card(TWO, CLUBS, R.drawable.c2));
        cards.add(new Card(THREE, CLUBS, R.drawable.c3));
        cards.add(new Card(FOUR, CLUBS, R.drawable.c4));
        cards.add(new Card(FIVE, CLUBS, R.drawable.c5));
        cards.add(new Card(SIX, CLUBS, R.drawable.c6));
        cards.add(new Card(SEVEN, CLUBS, R.drawable.c7));
        cards.add(new Card(EIGHT, CLUBS, R.drawable.c8));
        cards.add(new Card(NINE, CLUBS, R.drawable.c9));
        cards.add(new Card(TEN, CLUBS, R.drawable.c10));








//        populate(); // every time we populate the deck we call this function. Do not write logic inside the constructor.


    }
//        MODIFY POPULATE METHOD TO ADD IMAGE WHEN LOOPING.
//    public void populate(){
//        // use for loops to iterate through suit and rank. Use nested loops. Use values() method.
//        for (Suit suit : Suit.values()){
//            for (Rank rank : Rank.values()){
//                cards.add(new Card(rank, suit)); //  create new instance of Card and add it to the array.
//            }
//        }
//    }

    public Card getCard(){
        return cards.remove(0);
    }

    public void shuffle(){
        Collections.shuffle(cards); // inbuilt class on which shuffle() can be called
    }
}
