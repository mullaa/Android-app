package com.example.block08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent caller = getIntent();
        float rating = caller.getFloatExtra("nbstars", 0);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Welcome to the second activity! Your rating: " + rating);
    }
}
