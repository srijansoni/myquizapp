package com.example.vivek.myquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class main3Activity extends AppCompatActivity {
Button b,c;
    TextView t1,t2,t3,t4;
    Spinner spinner2;
    ArrayAdapter<CharSequence> adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        spinner2= (Spinner) findViewById(R.id.spinner);
        adapter2=ArrayAdapter.createFromResource(this,R.array.spinner,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i).toString().equals("Question 1"))
                {
                    Intent intent=new Intent(main3Activity.this,Main2Activity.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).toString().equals("Question 2"))
                {
                    Intent intent=new Intent(main3Activity.this,main3Activity.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).toString().equals("Question 3"))
                {
                    Intent intent=new Intent(main3Activity.this,Main4Activity.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).toString().equals("Question 4"))
                {
                    Intent intent=new Intent(main3Activity.this,Main5Activity.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).toString().equals("Question 5"))
                {
                    Intent intent=new Intent(main3Activity.this,Main6Activity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

            b= (Button) findViewById(R.id.n3);
        c= (Button) findViewById(R.id.ba3);
        t1= (TextView) findViewById(R.id.a3a);
        t2= (TextView) findViewById(R.id.a3b);
        t3= (TextView) findViewById(R.id.a3c);
        t4= (TextView) findViewById(R.id.a3d);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(main3Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundResource(R.drawable.shape);
                t2.setBackgroundResource(R.drawable.shape);
                t3.setBackgroundResource(R.drawable.shape);
                t4.setBackgroundResource(R.drawable.shape);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundColor(Color.RED);
                Toast.makeText(main3Activity.this,"Tough Luck",Toast.LENGTH_SHORT).show();
                t2.setBackgroundResource(R.drawable.shape);
                t3.setBackgroundResource(R.drawable.shape);
                t4.setBackgroundResource(R.drawable.shape);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setBackgroundColor(Color.GREEN);
                Toast.makeText(main3Activity.this,"Well Done",Toast.LENGTH_SHORT).show();
                t1.setBackgroundResource(R.drawable.shape);
                t3.setBackgroundResource(R.drawable.shape);
                t4.setBackgroundResource(R.drawable.shape);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3.setBackgroundColor(Color.RED);
                Toast.makeText(main3Activity.this,"Tough Luck",Toast.LENGTH_SHORT).show();
                t1.setBackgroundResource(R.drawable.shape);
                t2.setBackgroundResource(R.drawable.shape);
                t4.setBackgroundResource(R.drawable.shape);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t4.setBackgroundColor(Color.RED);
                Toast.makeText(main3Activity.this,"Tough Luck",Toast.LENGTH_SHORT).show();
                t1.setBackgroundResource(R.drawable.shape);
                t2.setBackgroundResource(R.drawable.shape);
                t3.setBackgroundResource(R.drawable.shape);
            }
        });
    }
}
