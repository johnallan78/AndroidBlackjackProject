package com.example.user.blackjackandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView playerOneCardOne;
    TextView playerOneCardTwo;
    TextView playerOneHand;
    TextView playerTwoCardOne;
    TextView playerTwoCardTwo;
    TextView playerTwoHand;
    TextView finalScore;

    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);




        playerOneCardOne = (TextView)findViewById(R.id.playerOneCardOne);
        playerOneCardTwo = (TextView)findViewById(R.id.playerOneCardTwo);
        playerOneHand = (TextView)findViewById(R.id.playerOneHand);
        playerTwoCardOne = (TextView)findViewById(R.id.playerTwoCardOne);
        playerTwoCardTwo = (TextView)findViewById(R.id.playerTwoCardTwo);
        playerTwoHand = (TextView)findViewById(R.id.playerTwoHand);
        finalScore = (TextView)findViewById(R.id.finalScore);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();


        String answer = extras.getString("First Card");
        playerOneCardOne.setText(answer);

        String answerTwo = extras.getString("Second Card");
        playerOneCardTwo.setText(answerTwo);

        String hand = extras.getString("Player 1 Hand");
        playerOneHand.setText(hand);

        String player2 = extras.getString("First Card Player 2");
        playerTwoCardOne.setText(player2);

        String player2card2 = extras.getString("Second Card Player 2");
        playerTwoCardTwo.setText(player2card2);

        String player2Hand = extras.getString("Player 2 Hand");
        playerTwoHand.setText(player2Hand);

        String result = extras.getString("Result");
        finalScore.setText(result);


    }
}
