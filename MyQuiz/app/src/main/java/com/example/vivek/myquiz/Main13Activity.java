package com.example.vivek.myquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main13Activity extends AppCompatActivity {
Button b;
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        b= (Button) findViewById(R.id.n13);
        t1= (TextView) findViewById(R.id.a13a);
        t2= (TextView) findViewById(R.id.a13b);
        t3= (TextView) findViewById(R.id.a13c);
        t4= (TextView) findViewById(R.id.a13d);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Main13Activity.this,Main14Activity.class);
                startActivity(intent);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundColor(Color.RED);
                Toast.makeText(Main13Activity.this,"Tough Luck",Toast.LENGTH_SHORT);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setBackgroundColor(Color.RED);
                Toast.makeText(Main13Activity.this,"Tough Luck",Toast.LENGTH_SHORT);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3.setBackgroundColor(Color.RED);
                Toast.makeText(Main13Activity.this,"Well Done",Toast.LENGTH_SHORT);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t4.setBackgroundColor(Color.GREEN);
                Toast.makeText(Main13Activity.this,"Tough Luck",Toast.LENGTH_SHORT);
            }
        });
    }
}
