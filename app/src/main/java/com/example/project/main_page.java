package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void register(View view) {
        Intent i_register = new Intent(main_page.this, register.class);
        startActivity(i_register);
    }

    public void display_no(View view) {
        Intent i_view = new Intent(main_page.this, Display.class);
        startActivity(i_view);

    }

    public void instruction(View view) {
        Intent i_help = new Intent(main_page.this, Instruction.class);
        startActivity(i_help);
    }
    public void verify(View v) {
        Intent i_verify=new Intent(main_page.this,verify.class);
        startActivity(i_verify);
    }
}
