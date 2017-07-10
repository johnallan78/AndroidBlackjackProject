package com.example.user.blackjackandroidproject;

import static com.example.user.blackjackandroidproject.R.id.player1;

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

    int playerhand = 0;
    int player2hand = 0;

    public String showFirstCard(){
        for (int i = 0; i < 2; i++) { //common for loop in Java. weird but useful.
            dealer.addCardToHand(dealer.deal());
            player.addCardToHand(dealer.deal());
        }
            Card card = dealer.showFirstCard();
            playerhand += card.cardValue();
            return card.cardName();
    }


    public String showSecondCard(){
        Card card = dealer.showSecondCard();
        playerhand += card.cardValue();
        return card.cardName();
    }

//    public String showFirstCardSecondPlayer(){
//        for (int i = 0; i < 4; i++) { //common for loop in Java. weird but useful.
//            dealer.addCardToHand(dealer.deal());
//            player.addCardToHand(dealer.deal());
//        }
//        Card card = dealer.showThirdCard();
//        player2hand += card.cardValue();
//        return card.cardName();
//    }
//
//    public String showSecondCardSecondPlayer(){
//        Card card = dealer.showFourthCard();
//        player2hand += card.cardValue();
//        return card.cardName();
//    }
//
//
//    public Integer playerHandValueSecondPlayer(){
//        return (player2hand / 2);
//    }




    public Integer playerHandValue(){
        return (playerhand / 2);
    }







//    public int showFirstCard(){
//        for (int i = 0; i < 2; i++) { //common for loop in Java. weird but useful.
//            dealer.addCardToHand(dealer.deal());
//            player.addCardToHand(dealer.deal());
//        }
//        Card card = dealer.showFirstCard();
//        return card.getImg();
//
//
//    }


}

