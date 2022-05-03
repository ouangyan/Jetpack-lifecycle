package com.yan.jetpack.lifecycle;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyLocationObserver implements LifecycleObserver {
    private Context context;
    private LocationManager locationManager;
    private MyLocationListener locationListener;

    public MyLocationObserver(Context context) {
        this.context = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void startLocation() {
        Log.i("1qaz2wsx", "startLocation");

        locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        locationListener = new MyLocationListener();
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 3000, 1, locationListener);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void stopLocation(){
        Log.i("1qaz2wsx","stopLocation");

        locationManager.removeUpdates(locationListener);
    }

    static class MyLocationListener implements LocationListener{
        @Override
        public void onLocationChanged(@NonNull Location location) {
            Log.i("1qaz2wsx","location changed:"+location.toString());
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(@NonNull String provider) {

        }

        @Override
        public void onProviderDisabled(@NonNull String provider) {

        }
    }
}
