package com.example.shoppingfastpass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter (View v) {
        Toast.makeText(getApplicationContext(),
                "next page...",
                Toast.LENGTH_SHORT).show();
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, Second_Activity.class);
        startActivity(goToSecond);
    }
}