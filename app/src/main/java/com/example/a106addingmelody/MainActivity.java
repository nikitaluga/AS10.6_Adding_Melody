package com.example.a106addingmelody;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    TextView songName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.elvis_tutty_frutty);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.elvis_pretty_woman);
        songName = findViewById(R.id.textViewSongName);
    }

    public void onStart(View view) {
        mediaPlayer.start();
        songName.setText("Elvis Tutti Frutty is playing");
    }

    public void onClickNextSong(View view) {
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
            mediaPlayer2.start();
            songName.setText("Elvis Pretty Woman is playing");
        }else if (mediaPlayer2.isPlaying()){
            mediaPlayer2.pause();
            mediaPlayer.start();
            songName.setText("Elvis Tutti Frutty is playing");
        }
    }
}
