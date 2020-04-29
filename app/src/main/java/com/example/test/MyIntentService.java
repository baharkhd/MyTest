package com.example.test;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class MyIntentService extends IntentService {

    MediaPlayer player;

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        player = MediaPlayer.create(getApplicationContext(), Settings.System.DEFAULT_RINGTONE_URI);
        player.setVolume(100, 100);
        player.setLooping(true);
        player.start();
    }
}
