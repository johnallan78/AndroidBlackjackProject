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
    Player player1;
    Player player2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) findViewById(R.id.playGame);

    }

    public void onPlayButtonClicked(View button) {


        player1 = new Player();
        player2 = new Player();
        game = new Game();
        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("First Card", player1.showFirstCard());
        Log.d("Card dealt", player1.showFirstCard());

        intent.putExtra("Second Card", player1.showSecondCard());
        Log.d("Second Card dealt", player1.showSecondCard());

        String string = Integer.toString(player1.playerHandValue());
        intent.putExtra("Player 1 Hand", "Player 1 Hand:" + string);
        Log.d("Hand value", player1.playerHandValue().toString());

        intent.putExtra("First Card Player 2", player2.showFirstCard());
        Log.d("Card dealt", player2.showFirstCard());

        intent.putExtra("Second Card Player 2", player2.showSecondCard());
        Log.d("Second Card dealt", player2.showSecondCard());

        String player2Hand = Integer.toString(player2.playerHandValue());
        intent.putExtra("Player 2 Hand", "Player 2 Hand:" + player2Hand);
        Log.d("Hand value", player2.playerHandValue().toString());


        this.startActivity(intent);

//        Toast.makeText(this, "Let's play!", Toast.LENGTH_SHORT).show();


    }


}