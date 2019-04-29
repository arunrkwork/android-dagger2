package com.example.dagger2.dagger;

import com.example.dagger2.car.Rims;
import com.example.dagger2.car.Tires;
import com.example.dagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModules {

    @Provides
    static Rims provideRimes() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
