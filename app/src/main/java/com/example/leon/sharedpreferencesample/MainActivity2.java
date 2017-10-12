package com.example.leon.sharedpreferencesample;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView resultDisplay = (TextView) findViewById(R.id.textView2);

        SharedPreferences resultPref = getSharedPreferences("My Saved Data", Context.MODE_PRIVATE);

        String myStringValue = resultPref.getString("myValue", "Data Not Found");

        resultDisplay.setText(myStringValue);

    }
}
