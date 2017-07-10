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

        String pic = Integer.toString(player1.showFirstCard());
        intent.putExtra("First Card", pic);


        String pic2 = Integer.toString(player1.showSecondCard());
        intent.putExtra("Second Card", pic2);
        Log.d("Second Card dealt", pic2);



        String pic3 = Integer.toString(player2.showFirstCard());
        intent.putExtra("First Card Player 2", pic3);

        String pic4 = Integer.toString(player2.showSecondCard());
        intent.putExtra("Second Card Player 2", pic4);

        String player2Hand = Integer.toString(player2.playerHandValue());
        intent.putExtra("Player 2 Hand", "Player 2 Hand: " + player2Hand);
        Log.d("Hand value", player2.playerHandValue().toString());

        if (player1.playerHandValue() < 16)
        { String playerCard3 = Integer.toString(player1.thirdCard());
        intent.putExtra("Third Card", playerCard3);

            String string = Integer.toString(player1.playerHandValue());
            intent.putExtra("Player 1 Hand", "Player 1 Hand: " + string);
            Log.d("Hand value", player1.playerHandValue().toString());

            String result = game.scoreCompare(player1.playerHandValue(), player2.playerHandValue());
            intent.putExtra("Result", result);
        }

        else

        {  String playerCard3 = Integer.toString(R.drawable.stand);
            intent.putExtra("Third Card", playerCard3);

            String string = Integer.toString(player1.playerHandValue());
            intent.putExtra("Player 1 Hand", "Player 1 Hand: " + string);
            Log.d("Hand value", player1.playerHandValue().toString());


            String result = game.scoreCompare(player1.playerHandValue(), player2.playerHandValue());
            intent.putExtra("Result", result);
        }

        Log.d("Third Card Value", player1.playerHandValue().toString());


//        String string = Integer.toString(player1.playerHandValue());
//        intent.putExtra("Player 1 Hand", "Player 1 Hand: " + string);
//        Log.d("Hand value", player1.playerHandValue().toString());
//
//        String result = game.scoreCompare(player1.playerHandValue(), player2.playerHandValue());
//        intent.putExtra("Result", result);



        this.startActivity(intent);

        Toast.makeText(this, "Visit www.begambleaware.org for the facts about gambling.", Toast.LENGTH_LONG).show();


    }


}