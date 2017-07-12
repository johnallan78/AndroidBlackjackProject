package com.example.user.blackjackandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class AboutActivity extends AppCompatActivity {
    //Activity provides a simple info/contact page.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void onPlayAgainButtonClicked(View button) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_rules:
                Intent intent = new Intent(this, RulesActivity.class);
                this.startActivity(intent);
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
