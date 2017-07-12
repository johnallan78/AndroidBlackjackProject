package com.example.user.blackjackandroidproject;

/**
 * Created by user on 07/07/2017.
 */

public class Player {

    Dealer dealer;
    Deck deck;
    Hand hand;


    // let the player class keep a running total of the card values.
    int playerhand = 0;


    public Player(){
        hand = new Hand();
        dealer = new Dealer(deck);
    }

    // Return an integer here. The dealer takes a card from the deck and reveals it to the player.
    // The playerhand value is saved and the card pic is returned.
    public int showFirstCard(){
        dealer.addCardToHand(dealer.deal());
        Card card = dealer.showFirstCard();
        playerhand += card.cardValue();
        return card.cardPic();
    }

    public int showSecondCard(){
        dealer.addCardToHand(dealer.deal());
        Card card = dealer.showSecondCard();
        playerhand += card.cardValue();
        return card.cardPic();
    }

    public Integer playerHandValue(){
        return (playerhand );
    }
}
