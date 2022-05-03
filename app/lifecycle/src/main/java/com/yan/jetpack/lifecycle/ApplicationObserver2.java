package com.yan.jetpack.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class ApplicationObserver2 implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Log.i("1qaz2wsx","onCreate2");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(){
        Log.i("1qaz2wsx","onStart2");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(){
        Log.i("1qaz2wsx","onResume2");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(){
        Log.i("1qaz2wsx","onPause2");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Log.i("1qaz2wsx","onStop2");
    }
}
