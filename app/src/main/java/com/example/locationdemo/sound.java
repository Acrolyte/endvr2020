package com.example.locationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);

        final MediaPlayer catSoundMP = MediaPlayer.create(this,R.raw.cool);
            catSoundMP.setLooping(true);

        Button play = (Button) this.findViewById(R.id.soundbutton);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catSoundMP.start();
            }
        });

    }
}
