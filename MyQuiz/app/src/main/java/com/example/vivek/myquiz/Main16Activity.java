package com.example.vivek.myquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main16Activity extends AppCompatActivity {
Button b;
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        b= (Button) findViewById(R.id.n16);
        t1= (TextView) findViewById(R.id.a16a);
        t2= (TextView) findViewById(R.id.a16b);
        t3= (TextView) findViewById(R.id.a16c);
        t4= (TextView) findViewById(R.id.a16d);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Main16Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundColor(Color.RED);
                Toast.makeText(Main16Activity.this,"Tough Luck",Toast.LENGTH_SHORT);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setBackgroundColor(Color.RED);
                Toast.makeText(Main16Activity.this,"Tough Luck",Toast.LENGTH_SHORT);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3.setBackgroundColor(Color.RED);
                Toast.makeText(Main16Activity.this,"Well Done",Toast.LENGTH_SHORT);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t4.setBackgroundColor(Color.GREEN);
                Toast.makeText(Main16Activity.this,"Tough Luck",Toast.LENGTH_SHORT);
            }
        });
    }
}
