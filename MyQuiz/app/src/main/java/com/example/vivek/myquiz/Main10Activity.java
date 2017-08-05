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

public class Main10Activity extends AppCompatActivity {
Button b,c;
    TextView t1,t2,t3,t4;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        spinner= (Spinner) findViewById(R.id.spinner);
        adapter=ArrayAdapter.createFromResource(this,R.array.spinner,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i).toString().equals("Question 1"))
                {
                    Intent intent=new Intent(Main10Activity.this,Main7Activity.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).toString().equals("Question 2"))
                {
                    Intent intent=new Intent(Main10Activity.this,Main8Activity.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).toString().equals("Question 3"))
                {
                    Intent intent=new Intent(Main10Activity.this,Main9Activity.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).toString().equals("Question 4"))
                {
                    Intent intent=new Intent(Main10Activity.this,Main10Activity.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).toString().equals("Question 5"))
                {
                    Intent intent=new Intent(Main10Activity.this,Main11Activity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        b= (Button) findViewById(R.id.n10);
        c= (Button) findViewById(R.id.ba10);
        t1= (TextView) findViewById(R.id.a10a);
        t2= (TextView) findViewById(R.id.a10b);
        t3= (TextView) findViewById(R.id.a10c);
        t4= (TextView) findViewById(R.id.a10d);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Main10Activity.this,Main11Activity.class);
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
                t1.setBackgroundColor(Color.GREEN);
                Toast.makeText(Main10Activity.this,"Well Done",Toast.LENGTH_SHORT).show();
                t2.setBackgroundResource(R.drawable.shape);
                t3.setBackgroundResource(R.drawable.shape);
                t4.setBackgroundResource(R.drawable.shape);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setBackgroundColor(Color.RED);
                Toast.makeText(Main10Activity.this,"Tough Luck",Toast.LENGTH_SHORT).show();
                t1.setBackgroundResource(R.drawable.shape);
                t3.setBackgroundResource(R.drawable.shape);
                t4.setBackgroundResource(R.drawable.shape);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3.setBackgroundColor(Color.RED);
                Toast.makeText(Main10Activity.this,"Tough Luck",Toast.LENGTH_SHORT).show();
                t1.setBackgroundResource(R.drawable.shape);
                t2.setBackgroundResource(R.drawable.shape);
                t4.setBackgroundResource(R.drawable.shape);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t4.setBackgroundColor(Color.RED);
                Toast.makeText(Main10Activity.this,"Tough Luck",Toast.LENGTH_SHORT).show();
                t1.setBackgroundResource(R.drawable.shape);
                t2.setBackgroundResource(R.drawable.shape);
                t3.setBackgroundResource(R.drawable.shape);
            }
        });
    }
}
