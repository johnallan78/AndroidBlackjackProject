package com.example.user.blackjackandroidproject;

import static com.example.user.blackjackandroidproject.R.id.player1;

/**
 * Created by user on 08/07/2017.
 */

public class Game {

    Deck deck;
    Dealer dealer;
    Player player;

    //Game instantiated with a deck, a dealer and a player. The dealer does not neccesarily have to
    //take part in the game, but will do so if only one player is added.

    public  Game(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player = new Player();
    }

    // The scoring logic. Returns a string rather than a void to make it easy to set in a TextView.
    public String scoreCompare(int player1Score, int player2Score) {

        if (player1Score > 21 && player2Score <= 21){
            return "Player 1 is BUST.";
        }

        else if (player1Score > 21 && player2Score > 21){
            return "Both players are BUST!";
        }
        else if (player1Score <= 21 && player2Score > 21){
            return "Player 2 is BUST.";
        }
        else if (player1Score > player2Score && player1Score <= 21) {
            return "Player 1 Wins!";
        }
        else if (player2Score > player1Score && player2Score <= 21) {
            return "Player 2 Wins!";
        }
        else if (player1Score == player2Score){
            return "A Draw!";
        }
        else return null;
    }
}

