package com.example.ch04;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.ch04_10);
        setContentView(R.layout.ex04_02);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        TextView tv3 = (TextView) findViewById(R.id.tv3);

        tv1.setText("안녕하세요");
        tv1.setTextColor(Color.RED);

        tv2.setTextSize(20);
        tv2.setTypeface(Typeface.SANS_SERIF);

        tv3.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        tv3.setSingleLine();

    }
}