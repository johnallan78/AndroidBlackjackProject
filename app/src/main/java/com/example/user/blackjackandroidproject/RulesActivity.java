package com.example.user.blackjackandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class RulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        // Daft toast message, feel free to comment out as it gets annoying after a while.
        Toast.makeText(this, "Visit www.begambleaware.org for the facts about gambling.",
                Toast.LENGTH_LONG).show();
    }

    public void onPlayAgainButtonClicked(View button) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_rules, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.about:
                Intent intentAbout = new Intent(this, AboutActivity.class);
                this.startActivity(intentAbout);
                break;
            case R.id.play_game:
                Intent intentGame = new Intent(this, ResultActivity.class);
                this.startActivity(intentGame);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
