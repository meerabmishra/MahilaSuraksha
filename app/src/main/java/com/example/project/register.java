package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
   EditText name,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void display(View view) {
        Intent i_View = new Intent(register.this,Display.class);
        startActivity(i_View);
    }
    public void instruction(View view) {
        Intent i_help = new Intent(register.this,Instruction.class);
        startActivity(i_help);
    }
    public void storeInDB(View view) {
      Toast.makeText(getApplicationContext(),"save started",Toast.LENGTH_LONG).show();
        name = (EditText) this.findViewById(R.id.editText1);
        number = (EditText) this.findViewById(R.id.editText2);
        String str_name=name.getText().toString();
        String str_number=number.getText().toString();
        SQLiteDatabase db;
        db=openOrCreateDatabase("NumDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS details(name VARCHAR,number VARCHAR);");
        Cursor c =db.rawQuery("SELECT * FROM details", null);
        if(c.getCount()<2)
        {
            db.execSQL("INSERT INTO details VALUES('"+str_name+"','"+str_number+"');");
            Toast.makeText(getApplicationContext(), "Successfully Saved",Toast.LENGTH_SHORT).show();
        }
        else {

            db.execSQL("INSERT INTO details VALUES('"+str_name+"','"+str_number+"');");
            Toast.makeText(getApplicationContext(), "Maximun Numbers limited reached. Previous numbers are replaced.",Toast.LENGTH_SHORT).show();
        }


        db.close();

    }




}





