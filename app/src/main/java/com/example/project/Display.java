package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.security.KeyStore;
import java.util.Locale;

public class Display extends AppCompatActivity {
    Cursor c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
      SQLiteDatabase db;
        db=openOrCreateDatabase("NumDB", Context.MODE_PRIVATE, null);
        c=db.rawQuery("SELECT * FROM details", null);
        if(c.getCount()==0)
        {
           showMessage("Error", "No records found.");
            return;
        }
        StringBuffer buffer=new StringBuffer();
        while(c.moveToNext())
        {
            buffer.append("Name: "+c.getString(0)+"\n");
            buffer.append("Number: "+c.getString(1)+"\n");
        }
        showMessage("Details", buffer.toString());
       Intent i_startservice=new Intent(Display.this,BgService.class);
        startService(i_startservice);
    }
    public void showMessage(String title,String message) {
       AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public void back(View v) {
        Intent i_back=new Intent(Display.this,main_page.class);
        startActivity(i_back);

    }


}
