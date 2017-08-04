package com.example.vivek.myquiz;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
 RadioGroup r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r= (RadioGroup) findViewById(R.id.radio);
        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                RadioButton r1= (RadioButton) findViewById(R.id.r1);
                RadioButton r2= (RadioButton) findViewById(R.id.r2);
                RadioButton r3= (RadioButton) findViewById(R.id.r3);
                if(r1.isChecked())
                {
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
                if(r2.isChecked())
                {
                    Intent intent=new Intent(MainActivity.this,Main7Activity.class);
                    startActivity(intent);
                }
                if(r3.isChecked())
                {
                    Intent intent=new Intent(MainActivity.this,Main12Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
