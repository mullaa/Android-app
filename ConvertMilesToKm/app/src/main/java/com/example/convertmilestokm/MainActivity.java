package com.example.convertmilestokm;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = (Button) findViewById(R.id.buttonConvMilestoKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText textBoxMiles = findViewById(R.id.editTextMiles);
                EditText textBoxKm = findViewById(R.id.editTextKm);
                double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vKms = vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKms));
            }
        });
        Button buttonConvKmToMiles = (Button) findViewById(R.id.buttonConvKmtoMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText textBoxKm = findViewById(R.id.editTextKm);
                EditText textBoxMiles = findViewById(R.id.editTextMiles);
                double vKms = Double.valueOf(textBoxKm.getText().toString());
                double vMiles = vKms*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));
            }
        });
    }
}
