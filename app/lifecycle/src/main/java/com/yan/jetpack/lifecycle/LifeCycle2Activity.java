package com.yan.jetpack.lifecycle;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

public class LifeCycle2Activity extends AppCompatActivity {

    private MyChronometer chronometer;
    private long elapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle);
        chronometer = findViewById(R.id.chronometer);
        // 生命周期监听
        getLifecycle().addObserver(chronometer);
    }
}