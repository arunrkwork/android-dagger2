package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {

    private static final String TAG = "Car";

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        Log.d(TAG, "Wheels: constructor called...");
        this.rims = rims;
        this.tires = tires;
    }
}
