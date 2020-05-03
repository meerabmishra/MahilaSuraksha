package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class secondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button but1 = (Button)findViewById(R.id.button);
        Button but2 = (Button)findViewById(R.id.button2);
        Button but3 = (Button)findViewById(R.id.button3);
        Button but4 = (Button)findViewById(R.id.button4);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(secondActivity.this,escape.class);
                startActivity(int1);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent int2 = new Intent(secondActivity.this,safety.class);
                  startActivity(int2);


    }
});
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(secondActivity.this,defence.class);
                startActivity(int3);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(secondActivity.this,laws.class);
                startActivity(int4);
            }
        });
    }
}
