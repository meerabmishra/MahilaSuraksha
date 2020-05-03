package com.example.project;


import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;



import java.util.List;

public class videoAdapter extends RecyclerView.Adapter<videoAdapter.VideoViewHolder> {
    List<youTubeVideos> youTubeVideosList;

    public videoAdapter() {

    }
    public  videoAdapter(List<youTubeVideos> youTubeVideosList) {
        this.youTubeVideosList = youTubeVideosList;
    }



    @Override
    public videoAdapter.VideoViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view,parent, false);
      return new VideoViewHolder(view);


    }
    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
                                                                                                                                                                                                   holder.videoWeb.loadData( youTubeVideosList.get(position).getVideoUrl(), "text/html" , "utf-8");
    }
    @Override
    public int getItemCount() { return youTubeVideosList.size();}

    public class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView videoWeb;
        public VideoViewHolder(View itemView) {
            super(itemView);

            videoWeb = (WebView) itemView.findViewById(R.id.videoWebView);
            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.getSettings().setDomStorageEnabled(true);
            videoWeb.clearCache(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {
        } );
    }
}
}


