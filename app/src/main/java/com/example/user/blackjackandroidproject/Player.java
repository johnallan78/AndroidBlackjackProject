package com.example.user.blackjackandroidproject;

/**
 * Created by user on 07/07/2017.
 */

public class Player {

    Dealer dealer;
    Deck deck;
    Hand hand;

    int playerhand = 0;


    public Player(){
        hand = new Hand();
        dealer = new Dealer(deck);
    }

    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    public Hand showHand(){
        return this.hand;
    }

    public String showFirstCard(){
            dealer.addCardToHand(dealer.deal());
            Card card = dealer.showFirstCard();
            playerhand += card.cardValue();
            return card.cardName();

    }


    public String showSecondCard(){
        dealer.addCardToHand(dealer.deal());
        Card card = dealer.showSecondCard();
        playerhand += card.cardValue();
        return card.cardName();
    }

    public Integer playerHandValue(){
        return (playerhand / 2 );
    }
}
