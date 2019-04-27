package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {

    private static final String TAG = "Car";

    @Inject
    public Wheels() {
        Log.d(TAG, "Wheels: constructor called...");
    }
}
