package com.example.leon.sharedpreferencesample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button saveBT = (Button) findViewById(R.id.button1);
        Button loadBT = (Button) findViewById(R.id.button2);
        Button goBT = (Button) findViewById(R.id.button3);
        final EditText valueET = (EditText) findViewById(R.id.editText1);
        final TextView resultTV = (TextView) findViewById(R.id.textView1);

        saveBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sharedPreferences = getSharedPreferences("My Saved Data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("myValue", valueET.getText().toString());
                editor.apply();

            }
        });

        loadBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultTV.setText(sharedPreferences.getString("myValue", "Data not found"));

            }
        });

        goBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent1);

            }
        });
    }
}
