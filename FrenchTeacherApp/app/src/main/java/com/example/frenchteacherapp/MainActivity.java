package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button blackBtn, yellowBtn, greenBtn, redBtn, purpleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapViewToId();

        blackBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
    }

    private void mapViewToId() {
        blackBtn = findViewById(R.id.blackBtn);
        yellowBtn = findViewById(R.id.yellowBtn);
        greenBtn = findViewById(R.id.greenBtn);
        redBtn = findViewById(R.id.redBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
    }

    @Override
    public void onClick(View view) {
        int clickBtnId = view.getId();

        if (clickBtnId == R.id.blackBtn) play(R.raw.black);
        else if (clickBtnId == R.id.redBtn) play(R.raw.red);
        else if (clickBtnId == R.id.purpleBtn) play(R.raw.purple);
        else if (clickBtnId == R.id.yellowBtn) play(R.raw.yellow);
        else play(R.raw.green);
    }

    private void play(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(
                getApplicationContext(),
                id
        );
        mediaPlayer.start();
    }
}