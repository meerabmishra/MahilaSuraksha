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
    Vector<youTubeVideos> youTubeVideos = new Vector<>();


    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_defence);


        recyclerView = (RecyclerView) findViewById(R.id.recylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new videoAdapter());

        youTubeVideos.add(new youTubeVideos("<iframe width=\"300\" height=\"300\" src\"https://www.youtube.com/watch?v=KVpxP3ZZtAc\"  frameborder=\\\"0\\\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("iframe width=\"300\" height=\"300\" src\"https://www.youtube.com/watch?v=T7aNSRoDCmg\"  frameborder=\\\"0\\\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("iframe width=\"300\" height=\"300\" src\"https://www.youtube.com/watch?v=M4_8PoRQP8w\"  frameborder=\\\"0\\\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("iframe width=\"300\" height=\"300\" src\"https://www.youtube.com/watch?v=jAh0cU1J5zk\"  frameborder=\\\"0\\\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("iframe width=\"300\" height=\"300\" src\"https://www.youtube.com/watch?v=0UqK3tfuu8Q\"  frameborder=\\\"0\\\" allowfullscreen></iframe>"));
        youTubeVideos.add(new youTubeVideos("iframe width=\"300\" height=\"300\" src\"https://www.youtube.com//watch?v=bLB85VwjkY0ge3\"  frameborder=\\\"0\\\" allowfullscreen></iframe>"));
    }

    }






