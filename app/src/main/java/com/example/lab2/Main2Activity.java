package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.*;

import android.content.*;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        //textView2.setText("Hello " + str);
        customText(str);
    }

    private void customText(String s) {
        if(s.equals("Daisy") || s.equals("daisy")) {
            textView2.setText(s + " is kinda bad and should go back to studying :)");
        } else {
            textView2.setText(s + " is pretty cool :D");
        }
    }
}
