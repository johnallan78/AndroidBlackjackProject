package com.example.user.blackjackandroidproject;

/**
 * Created by user on 08/07/2017.
 */

public class Game {

    Deck deck;
    Dealer dealer;
    Player player;

    public  Game(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player = new Player();
    }

    public String play(){
        for (int i = 0; i < 2; i++) { //common for loop in Java. weird but useful.
            dealer.addCardToHand(dealer.deal());
            player.addCardToHand(dealer.deal());
        }
            Card card = dealer.showFirstCard();
            return card.cardName();

    }
}

