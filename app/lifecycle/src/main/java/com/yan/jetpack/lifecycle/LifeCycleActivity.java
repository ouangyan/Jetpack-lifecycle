package com.yan.jetpack.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

public class LifeCycleActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private long elapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle);
        chronometer = findViewById(R.id.chronometer);
    }

    @Override
    public void onResume(){
        super.onResume();
        chronometer.setBase(SystemClock.elapsedRealtime() - elapsedTime);
        chronometer.start();
    }

    @Override
    public void onPause(){
        super.onPause();
        elapsedTime = SystemClock.elapsedRealtime() - chronometer.getBase();
        chronometer.stop();
    }
}