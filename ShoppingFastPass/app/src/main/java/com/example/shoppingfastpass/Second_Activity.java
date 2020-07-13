package com.example.shoppingfastpass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class Second_Activity extends AppCompatActivity {

    NumberPicker possibilities;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        webView = (WebView) findViewById(R.id.webView);
        // define the texts to be displayed by the number picker
        String[] possibilitiesStrings = {
                "Chanel",
                "Dior",
                "La Mer",
        };
        // associate the defined texts to the number picker
        possibilities.setDisplayedValues(possibilitiesStrings);

        // the number picker offers 3 choices, indexed from 0 to 2
        // (length of the array of strings is 3)
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesStrings.length - 1);

        Intent caller = getIntent();
    }

    public void navigate(View v) {
        // retrieve the index of the user's choice on the number picker
        int choice = possibilities.getValue();
        // when a link is clicked in the selected page, do not open a browser to display
        // the linked page, instead display it in the (same) web view (replacing
        // the initially selected page)
        webView.setWebViewClient(new WebViewClient());
        // load the appropriate web page
        if (choice == 0) {
            // load the android.html page stored in the assets of the application
            webView.loadUrl("https://www.chanel.com/us/");
        } else if (choice == 1)
            // load the checklist.html page stored in the assets of the application
            webView.loadUrl("https://www.dior.com/en_us");
        else if (choice == 2)
            // load the coursera web page from the Internet
            // -> require modification to the AndroidManisfest.xml file:
            //  <uses-permission android:name="android.permission.INTERNET"/>
            webView.loadUrl("https://www.cremedelamer.com/");
    }

}