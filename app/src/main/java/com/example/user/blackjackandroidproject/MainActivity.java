package com.example.user.blackjackandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button playButton;
    Game game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) findViewById(R.id.playGame);

    }

    public void onPlayButtonClicked(View button) {

//        int cardPic = card.getImg();
//        String string = Integer.toString(cardPic);


        game = new Game();
        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("First Card", game.showFirstCard());
        Log.d("Card dealt", game.showFirstCard());

        intent.putExtra("Second Card", game.showSecondCard());
        Log.d("Second Card dealt", game.showSecondCard());

        String string = Integer.toString(game.playerHandValue());
        intent.putExtra("Player 1 Hand", "Player 1 Hand:" + string);
        Log.d("Hand value", game.playerHandValue().toString());
//
        intent.putExtra("First Card Player 2", game.showFirstCardSecondPlayer());
        Log.d("Card dealt", game.showFirstCard());

        intent.putExtra("Second Card Player 2", game.showSecondCardSecondPlayer());
        Log.d("Second Card dealt", game.showSecondCard());

        String player2Hand = Integer.toString(game.playerHandValueSecondPlayer());
        intent.putExtra("Player 2 hand",player2Hand );


        // write logic to show another card
        this.startActivity(intent);

//        Toast.makeText(this, "Let's play!", Toast.LENGTH_SHORT).show();


    }


}