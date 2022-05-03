package com.yan.jetpack.lifecycle;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.Chronometer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyChronometer extends Chronometer implements LifecycleObserver {
    private long elapsedTime;

    public MyChronometer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void startChronometer(){
        setBase(SystemClock.elapsedRealtime() - elapsedTime);
        start();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void stopChronometer(){
        elapsedTime = SystemClock.elapsedRealtime() - getBase();
        stop();
    }
}
