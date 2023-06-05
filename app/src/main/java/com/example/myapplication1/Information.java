package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Information extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
       Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.msg);


        TextView textView = findViewById(R.id.informationText);
        textView.setText(message);


    }
}