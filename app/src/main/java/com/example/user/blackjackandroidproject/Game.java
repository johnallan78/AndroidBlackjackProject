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

    public String scoreCompare(int player1Score, int player2Score) {
        if (player1Score > player2Score) {
            return "Player 1 Wins!";
        } else if (player1Score == player2Score) {
            return "A draw";
        } else
            return "Player 2 Wins!";
    }
}

