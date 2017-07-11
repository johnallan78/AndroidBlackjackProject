package com.example.user.blackjackandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_rules:
                Intent intent = new Intent(this, RulesActivity.class);
                this.startActivity(intent);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
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


        if (player1.playerHandValue() < 16)

        {   String playerCard3 = Integer.toString(player1.thirdCard());
            intent.putExtra("Third Card", playerCard3);

            String string = Integer.toString(player1.playerHandValue());
            intent.putExtra("Player 1 Hand", "Player 1 Hand: " + string);
            Log.d("Hand value", player1.playerHandValue().toString());


        }

        else

        {   String playerCard3 = Integer.toString(R.drawable.stand);
            intent.putExtra("Third Card", playerCard3);

            String string = Integer.toString(player1.playerHandValue());
            intent.putExtra("Player 1 Hand", "Player 1 Hand: " + string);
            Log.d("Hand value", player1.playerHandValue().toString());



        }

        if (player2.playerHandValue() < 16)

        {   String playerCard3 = Integer.toString(player2.thirdCard());
            intent.putExtra("Third Card Player 2", playerCard3);

            String string = Integer.toString(player2.playerHandValue());
            intent.putExtra("Player 2 Hand", "Player 2 Hand: " + string);
            Log.d("Hand value", player2.playerHandValue().toString());


        }

        else

        {   String playerCard3 = Integer.toString(R.drawable.stand);
            intent.putExtra("Third Card Player 2", playerCard3);

            String string = Integer.toString(player2.playerHandValue());
            intent.putExtra("Player 2 Hand", "Player 2 Hand: " + string);
            Log.d("Hand value", player2.playerHandValue().toString());



        }

        Log.d("Final scores", player1.playerHandValue().toString());
        Log.d("Final scores", player2.playerHandValue().toString());

        String result = game.scoreCompare(player1.playerHandValue(), player2.playerHandValue());
        intent.putExtra("Result", result);

        this.startActivity(intent);

//        Toast.makeText(this, "Visit www.begambleaware.org for the facts about gambling.", Toast.LENGTH_LONG).show();


    }


}