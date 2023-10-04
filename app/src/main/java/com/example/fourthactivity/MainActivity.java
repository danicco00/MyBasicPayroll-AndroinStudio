package com.example.fourthactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText i1,i3,i4,i2;

    TextView ans1;
    TextView ans2;
    TextView ans4, ans3, ans5;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1= findViewById(R.id.i1);
        i2= findViewById(R.id.i2);
        i3= findViewById(R.id.i3);
        i4= findViewById(R.id.i4);
        ans1= findViewById(R.id.ans11);
        ans2= findViewById(R.id.ans22);
        ans5= findViewById(R.id.ans55);
        ans4= findViewById(R.id.ans44);
        ans3= findViewById(R.id.ans33);


        Button btn= findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
     public void onClick(View v) {

                onClickk();

            }

     public void onClickk() {

                int n1 = Integer.parseInt(i1.getText().toString());
                double n2 = Double.parseDouble(i2.getText().toString());
                double rp,gp;
                double ot;
                double oot;
                double ot1,gp1;
                rp = n1*n2;

                if (n1 < 41) {
                    ot = 0;
                    gp= rp;
                    ans1.setText("Regular pay: " + rp);
                    ans2.setText("Over time: " + ot);
                    ans5.setText("Gross Pay: " + gp);



                }else{

                    rp= 40*n2;
                    ot= 1.5*n2*(n1-40);
                    gp= rp+ot;
                    gp1=ot+rp;
                    ans1.setText("Regular pay: " + rp);
                    ans2.setText("Over time: " + ot);
                    ans5.setText("Gross Pay: " + gp1);


                }
         String n3 = new String(i3.getText().toString());
         String n4 = new String(i4.getText().toString());


         if(Objects.equals(n3, "A") || Objects.equals(n3, "a") ){
             if(Objects.equals(n4, "N") || Objects.equals(n4, "n") ) {
                 double tax, np;

                 tax = 0.07 * gp;
                 np = gp - tax;
                 ans4.setText("Tax: " + tax);
                 ans3.setText("Net Pay: " + np);
             }else {
                 double tax, np;

                 tax = 0.045 * gp;
                 np = gp - tax;
                 ans4.setText("Tax: " + tax);
                 ans3.setText("Net Pay: " + np);
             }
         }else{
             ans4.setText("No Tax: ");
             ans3.setText("Net Pay: " +gp);
         }
            }





        });


        }}