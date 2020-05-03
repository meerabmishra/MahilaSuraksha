package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laws extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);
        Button but1 = (Button)findViewById(R.id.button1);
        Button but2 = (Button)findViewById(R.id.button2);
        Button but3 = (Button)findViewById(R.id.button3);
        Button but4 = (Button)findViewById(R.id.button4);
        Button but5 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but7 = (Button) findViewById(R.id.button7);
        Button but8 = (Button) findViewById(R.id.button8);
        Button but9 = (Button) findViewById(R.id.button9);
        Button but10 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(laws.this,acidAttack.class);
                startActivity(int1);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(laws.this,rape.class);
                startActivity(int2);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(laws.this,kidnapping.class);
                startActivity(int3);

            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(laws.this,murder.class);
                startActivity(int4);
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(laws.this,cruelty.class);
                startActivity(int5);
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(laws.this,outraging.class);
                startActivity(int6);
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(laws.this,sexual.class);
                startActivity(int7);
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(laws.this,assault.class);
                startActivity(int8);
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(laws.this,voyeurism.class);
                startActivity(int9);
            }
        });
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10 = new Intent(laws.this,stalking.class);
                startActivity(int10);
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11 = new Intent(laws.this,word.class);
                startActivity(int11);
            }
        });
    }
}
