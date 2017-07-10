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


    public int showFirstCard(){
        dealer.addCardToHand(dealer.deal());
        Card card = dealer.showFirstCard();
        playerhand += card.cardValue();
        return card.cardPic();

    }

//      KEEP THIS METHOD!
//    public String showFirstCard(){
//            dealer.addCardToHand(dealer.deal());
//            Card card = dealer.showFirstCard();
//            playerhand += card.cardValue();
//            return card.cardName();
//
//    }



    public int showSecondCard(){
        dealer.addCardToHand(dealer.deal());
        Card card = dealer.showSecondCard();
        playerhand += card.cardValue();
        return card.cardPic();
    }

//      keep this method!
//    public String showSecondCard(){
//        dealer.addCardToHand(dealer.deal());
//        Card card = dealer.showSecondCard();
//        playerhand += card.cardValue();
//        return card.cardName();
//    }

    public Integer playerHandValue(){
        return (playerhand );
    }
}
