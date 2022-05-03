package com.yan.jetpack.lifecycle;

import androidx.lifecycle.LifecycleService;

public class MyLocationService extends LifecycleService {
    public MyLocationService() {
        MyLocationObserver locationObserver = new MyLocationObserver(this);
        getLifecycle().addObserver(locationObserver);
    }
}
