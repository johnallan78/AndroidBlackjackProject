package com.example.user.blackjackandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView playerOneHand;
    TextView playerTwoHand;
    TextView finalScore;
    Button playAgainButton;
    ImageView image;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;
    ImageView image6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        playerOneHand = (TextView)findViewById(R.id.playerOneHand);
        playerTwoHand = (TextView)findViewById(R.id.playerTwoHand);
        playAgainButton = (Button)findViewById(R.id.playAgain);
        finalScore = (TextView)findViewById(R.id.finalScore);
        image = (ImageView)findViewById(R.id.cardImage);
        image2 = (ImageView)findViewById(R.id.card2Image);
        image3 = (ImageView)findViewById(R.id.card3Image);
        image4 = (ImageView)findViewById(R.id.card4Image);
        image5 = (ImageView)findViewById(R.id.card5Image);
        image6 = (ImageView)findViewById(R.id.card6Image);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        int player1card1 = Integer.parseInt(extras.getString("First Card"));
        image.setImageResource(player1card1);

        int player1card2 = Integer.parseInt(extras.getString("Second Card"));
        image2.setImageResource(player1card2);

        String hand = extras.getString("Player 1 Hand");
        playerOneHand.setText(hand);

        int player2card1 = Integer.parseInt(extras.getString("First Card Player 2"));
        image3.setImageResource(player2card1);

        int player2card2 = Integer.parseInt(extras.getString("Second Card Player 2"));
        image4.setImageResource(player2card2);

        String player2Hand = extras.getString("Player 2 Hand");
        playerTwoHand.setText(player2Hand);

        int player1card3 = Integer.parseInt(extras.getString("Third Card"));
        image5.setImageResource(player1card3);

        int player2card3 = Integer.parseInt(extras.getString("Third Card Player 2"));
        image6.setImageResource(player2card3);



        String result = extras.getString("Result");
        finalScore.setText(result);



    }

    public void onPlayAgainButtonClicked(View button) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
}
