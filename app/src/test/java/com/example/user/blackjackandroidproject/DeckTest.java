package com.example.user.blackjackandroidproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.example.user.blackjackandroidproject.Rank.ACE;
import static com.example.user.blackjackandroidproject.Rank.FOUR;
import static com.example.user.blackjackandroidproject.Suit.CLUBS;
import static com.example.user.blackjackandroidproject.Suit.SPADES;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/07/2017.
 */

public class DeckTest {

    Card cardOne;
    Card cardTwo;
    Hand hand;

    @Before
    public void setUp() throws Exception {
        cardOne = new Card(FOUR, CLUBS);
        cardTwo = new Card(ACE, SPADES);
        hand = new Hand();
    }

    @Test
    public void testCardNameAndSuit() throws Exception {
        assertEquals( "c4", cardOne.cardName());
    }

    @Test
    public void testCardIsAddedToHand() throws Exception {
        hand.addCard(cardOne);
        hand.addCard(cardTwo);
        assertEquals("c4", hand.showFirstCard());
    }

    @Test
    public void testShowHand() throws Exception {
        hand.addCard(cardOne);
        hand.addCard(cardTwo);

        assertEquals(("c4, s11"), hand.showHand());
    }

    @Test
    public void testGetHandValue() throws Exception {
        hand.addCard(cardOne);
        hand.addCard(cardTwo);
        assertEquals(15, hand.getHandValue());
    }


}
