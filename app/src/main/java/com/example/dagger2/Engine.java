package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Engine {

    private static final String TAG = "Car";

    @Inject
    public Engine() {
        Log.d(TAG, "Engine: constructor called...");
    }
}
