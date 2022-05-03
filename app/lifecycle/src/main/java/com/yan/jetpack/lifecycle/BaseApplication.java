package com.yan.jetpack.lifecycle;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * application解耦
         */
        ProcessLifecycleOwner.get()
                .getLifecycle()
                .addObserver(new ApplicationObserver());

        // 可以实现多个
//        ProcessLifecycleOwner.get()
//                .getLifecycle()
//                .addObserver(new ApplicationObserver2());
    }
}
