package com.example.user.blackjackandroidproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
        hitButton1 = (Button) findViewById(R.id.hitButton1);
        hitButton2 = (Button) findViewById(R.id.hitButton2);
        playerOne = new Player();
        playerTwo = new Player();

        hitButton1.setEnabled(false);
        hitButton2.setEnabled(false);

        // https://www.youtube.com/watch?v=LCLO7q2uhOs
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                //The card drawable is an int
                int player1card1 = playerOne.showFirstCard();
                image.setImageResource(player1card1);

                int player1card2 = playerOne.showSecondCard();
                image2.setImageResource(player1card2);

                hitButton1.setEnabled(true);

                // We want to display the player's hand total in a textView, so have to convert the
                // playerHandValue()to a string. Make sure we are tracking the player's hand as an integer
                // BEFORE converting.
                String hand = Integer.toString(playerOne.playerHandValue());
                player1 += playerOne.playerHandValue();
                playerOneHand.setText("Player 1 Hand: " + hand);

            }
        }, 2000);




        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                int player2card1 = playerTwo.showFirstCard();
                image3.setImageResource(player2card1);

                int player2card2 = playerTwo.showSecondCard();
                image4.setImageResource(player2card2);

                hitButton2.setEnabled(true);


                String player2Hand = Integer.toString(playerTwo.playerHandValue());
                player2 += playerTwo.playerHandValue();
                playerTwoHand.setText("Player 2 Hand: " + player2Hand);

            }
        }, 4000);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_rules:
                Intent intent = new Intent(this, RulesActivity.class);
                this.startActivity(intent);
                break;
            case R.id.about:
                Intent intentAbout = new Intent(this, AboutActivity.class);
                this.startActivity(intentAbout);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    public void onPlayAgainButtonClicked(View button) {
        // Some straight-from-the-box code from Stack. Creates a button which takes us back to the
        // main activity.
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void onHitButtonClickedPlayer1(View button) {


        playerOne = new Player();


        if (player1 > 16){
            // Player cannot 'hit' if over 16
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
            // Seems a strange place to be instantiating a game object right at the end of a game,
            // but I would rather call the scoring method from the game class than write the logic
            // in this method.
            game = new Game();
            String result = game.scoreCompare(player1, player2);
            finalScore.setText(result);
    }
}
