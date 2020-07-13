package com.example.block08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void enter(View v) {
        // retrieve a reference to the View defined in the activity_first.xml
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        // get the rating set by the user
        float rating = ratingBar.getRating();
        // create an Intent to launch the second activity
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, SecondActivity.class);
        // pass the rating value to the second activity
        goToSecond.putExtra("nbStars", rating);
        // start the second activity
        startActivity(goToSecond);
        // remove this current activity
        finish();
    }
}