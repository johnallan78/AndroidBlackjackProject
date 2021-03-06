package com.example.user.blackjackandroidproject;

/**
 * Created by user on 07/07/2017.
 */

public class Dealer {

    Deck deck;
    Hand hand;

    //Dealer is instantiated with a new deck each time and shuffles the cards.
    public Dealer(Deck newDeck) {
        this.deck = new Deck();
        this.hand = new Hand();
        shuffle();
    }

    public void shuffle() {
        this.deck.shuffle();
    }

    public Card deal() {
        return deck.getCard();
    }

    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    public Card showFirstCard() {
        return hand.showFirstCard();
    }

    public Card showSecondCard() {
        return hand.showSecondCard();
    }

}
