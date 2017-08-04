package com.example.vivek.myquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main6Activity extends AppCompatActivity {
Button b;
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b= (Button) findViewById(R.id.n6);
        t1= (TextView) findViewById(R.id.a6a);
        t2= (TextView) findViewById(R.id.a6b);
        t3= (TextView) findViewById(R.id.a6c);
        t4= (TextView) findViewById(R.id.a6d);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Main6Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundColor(Color.RED);
                Toast.makeText(Main6Activity.this,"Tough Luck",Toast.LENGTH_SHORT);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setBackgroundColor(Color.RED);
                Toast.makeText(Main6Activity.this,"Tough Luck",Toast.LENGTH_SHORT);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3.setBackgroundColor(Color.GREEN);
                Toast.makeText(Main6Activity.this,"Well Done",Toast.LENGTH_SHORT);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t4.setBackgroundColor(Color.RED);
                Toast.makeText(Main6Activity.this,"Tough Luck",Toast.LENGTH_SHORT);
            }
        });
    }
}
