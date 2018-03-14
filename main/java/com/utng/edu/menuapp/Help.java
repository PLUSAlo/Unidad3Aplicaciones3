package com.utng.edu.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by alo_m on 17/02/2018.
 */

public class Help extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, YouTubePlayer.PlaybackEventListener {


    String claveYoutube="AIzaSyC2UJqFnEFjfmycKxEV35sTb3ZOEqs1B4U";
    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_layout);

        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(claveYoutube, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        if(!b){
            youTubePlayer.cueVideo("-CLCwIBzBbs");
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if(youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(this, 1).show();
        }else{
            String error= getString(R.string.error_youtube)+youTubeInitializationResult.toString();
            Toast.makeText(getApplication(),error,Toast.LENGTH_SHORT).show();

        }
    }

    protected void onActivityResult(int requestCore, int resultCode, Intent data){
        if(resultCode==1){
            getYoutubePlayerProvider().initialize(claveYoutube, this);
        }
    }

    protected YouTubePlayer.Provider getYoutubePlayerProvider(){
        return  youTubePlayerView;
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
}
