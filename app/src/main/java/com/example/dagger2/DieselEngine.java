package com.example.dagger2;

import android.util.Log;

public class DieselEngine implements Engine{

    private static final String TAG = "Car";

    @Override
    public void start() {
        Log.d(TAG, "start: diesel engine ");
    }
}
