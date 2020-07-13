package com.example.block01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonBlue, buttonPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBlue = (Button) findViewById(R.id.button_blueInvisible);
        buttonBlue.setOnClickListener(this);
        buttonPink = new Button(getApplicationContext());
        buttonPink.setTextColor(Color.BLACK);
        buttonPink.setBackgroundColor(Color.parseColor("#FD9BF3"));
        buttonPink.setText("The Pink Pather's To Do List");
        RelativeLayout relative_mainScreen= (RelativeLayout) findViewById(R.id.relative_mainScreen);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        params.addRule(RelativeLayout.BELOW, buttonBlue.getId());
        relative_mainScreen.addView(buttonPink,params);
        buttonPink.setOnClickListener(this);
    }
    public void toDo (View v) {
        if (v.equals(buttonBlue))
            //invisibility stuff
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonPink))
            //POP-UP
            Toast.makeText(getApplicationContext(),
                    "to do to do to do...",
                    Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        toDo(view);
    }
}