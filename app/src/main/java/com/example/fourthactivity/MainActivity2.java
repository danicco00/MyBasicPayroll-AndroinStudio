package com.example.fourthactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String ans111="ans11";
    public static final String ans222="ans22";
    EditText i1;
    EditText i2;
    TextView ans11,ans22,ans1111,ans2222;
    private int ans1,ans2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ans1111 = (TextView) findViewById(R.id.ans5);
        ans2222 = (TextView) findViewById(R.id.ans22);
        Intent intent=getIntent();
        ans1 = intent.getIntExtra(ans111,0);
        ans2 = intent.getIntExtra(ans222,0);
        ans1111.setText("Hours Worked"+ans1);
        ans2222.setText("Hours Rate"+ans2);
    }}