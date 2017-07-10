package com.example.user.blackjackandroidproject;

/**
 * Created by user on 07/07/2017.
 */

public class Dealer {

    Deck deck;
    Hand hand;

    public Dealer(Deck newDeck){
        this.deck = newDeck;
        this.hand = new Hand();
        shuffle();
    }

    public void shuffle(){
        this.deck.shuffle();
    }

    public Card deal(){
        return deck.getCard();
    }

    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    public Card showFirstCard(){
        return hand.showFirstCard();
    }

    public Card showSecondCard(){
        return hand.showSecondCard();
    }

    public Card showThirdCard(){
        return hand.showThirdCard();
    }

    public Card showFourthCard(){
        return hand.showFourthCard();
    }




    public Hand showHand(){
        return hand;
    }
}
