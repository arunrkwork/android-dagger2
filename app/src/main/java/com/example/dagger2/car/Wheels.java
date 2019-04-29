package com.example.dagger2.car;

import android.util.Log;

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
