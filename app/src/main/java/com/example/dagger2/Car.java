package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    @Inject Engine engine;
    @Inject Wheels wheels;

    /*
        Inject work in the order of

        1. constructor
        2. fields (Ex : object declaration)
        3. methods

    */
    @Inject
    public Car() {
        Log.d(TAG, "Car constructor called...");
    }

    @Inject
    public void enableRemote(Remote remote) {
        Log.d(TAG, "enableRemote: called...");
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving ... ");
    }
}


