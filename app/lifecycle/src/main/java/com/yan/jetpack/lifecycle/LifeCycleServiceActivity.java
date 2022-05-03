package com.yan.jetpack.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LifeCycleServiceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.lifecycle_service);
    }

    public void startService(View view) {
        Intent myLocationService = new Intent(this,MyLocationService.class);
        startService(myLocationService);
    }

    public void stopService(View view) {
        Intent myLocationService = new Intent(this,MyLocationService.class);
        stopService(myLocationService);
    }
}
