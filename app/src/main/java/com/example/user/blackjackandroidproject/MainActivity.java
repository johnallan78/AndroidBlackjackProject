package com.example.user.blackjackandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        intent.putExtra("First Card", game.play());
        this.startActivity(intent);

        Toast.makeText(this, "Let's play!", Toast.LENGTH_LONG).show();


    }


}