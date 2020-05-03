package com.example.project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Vector;

public class defence extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<youTubeVideos> youTubeVideos = new Vector<youTubeVideos>();


    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_defence);


        recyclerView = (RecyclerView) findViewById(R.id.recylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        youTubeVideos.add(new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KVpxP3ZZtAc\"  frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-V4vEyhWDZ0\"  frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/M4_8PoRQP8w\"  frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/jAh0cU1J5zk\"  frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/0UqK3tfuu8Q\"  frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/k9Jn0eP-ZVg\"  frameborder=\"0\" allowfullscreen></iframe>"));

        videoAdapter mvideoAdapter = new videoAdapter(youTubeVideos);
        recyclerView.setAdapter(mvideoAdapter);
    }

    }






