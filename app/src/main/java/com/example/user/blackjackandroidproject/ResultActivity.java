package com.example.user.blackjackandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.user.blackjackandroidproject.R.id.player1;

public class ResultActivity extends AppCompatActivity {

    TextView playerOneHand;
    TextView playerTwoHand;
    TextView finalScore;
    Button playAgainButton;
    Button hitButton1;
    Button hitButton2;
    ImageView image;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;
    ImageView image6;
    Player playerOne;
    Player playerTwo;
    Game game;

    Integer player1 = 0;
    Integer player2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        playerOneHand = (TextView) findViewById(R.id.playerOneHand);
        playerTwoHand = (TextView) findViewById(R.id.playerTwoHand);
        playAgainButton = (Button) findViewById(R.id.playAgain);
        finalScore = (TextView) findViewById(R.id.finalScore);
        image = (ImageView) findViewById(R.id.cardImage);
        image2 = (ImageView) findViewById(R.id.card2Image);
        image3 = (ImageView) findViewById(R.id.card3Image);
        image4 = (ImageView) findViewById(R.id.card4Image);
        image5 = (ImageView) findViewById(R.id.card5Image);
        image6 = (ImageView) findViewById(R.id.card6Image);
        playerOne = new Player();
        playerTwo = new Player();

        int player1card1 = playerOne.showFirstCard();
        image.setImageResource(player1card1);

        int player1card2 = playerOne.showSecondCard();
        image2.setImageResource(player1card2);

        String hand = Integer.toString(playerOne.playerHandValue());
        player1 += playerOne.playerHandValue();
        playerOneHand.setText("Player 1 Hand: " + hand);

        int player2card1 = playerTwo.showFirstCard();
        image3.setImageResource(player2card1);

        int player2card2 = playerTwo.showSecondCard();
        image4.setImageResource(player2card2);

        String player2Hand = Integer.toString(playerTwo.playerHandValue());
        player2 += playerTwo.playerHandValue();
        playerTwoHand.setText("Player 2 Hand: " + player2Hand);
    }

    public void onPlayAgainButtonClicked(View button) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void onHitButtonClickedPlayer1(View button) {

        hitButton1 = (Button) findViewById(R.id.hitButton1);
        playerOne = new Player();


        if (player1 > 16){
            hitButton1.setEnabled(false);
            }
        else
            {
            int player1card3 = playerOne.showFirstCard();
            player1 += playerOne.playerHandValue();
            image5.setImageResource(player1card3);


            String playerResult = Integer.toString(player1);
            playerOneHand.setText("Player 1 Hand: " + playerResult);
            }

    }

    public void onHitButtonClickedPlayer2(View button) {

        hitButton2 = (Button) findViewById(R.id.hitButton2);
        playerTwo = new Player();

        if (player2 > 16){
            hitButton2.setEnabled(false);
            }
        else
            {
            int player2card3 = playerTwo.showFirstCard();
            player2 += playerTwo.playerHandValue();
            image6.setImageResource(player2card3);

            String playerResult = Integer.toString(player2);
            playerTwoHand.setText("Player 2 Hand: " + playerResult);
            }
            game = new Game();
            String result = game.scoreCompare(player1, player2);
            finalScore.setText(result);

    }
}
