package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent1 = new Intent(getApplicationContext(), MyService.class);

        Intent intent2 = new Intent(getApplicationContext(), MyIntentService.class);

        startService(intent2);





    }
}
