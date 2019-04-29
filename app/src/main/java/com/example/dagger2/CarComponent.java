package com.example.dagger2;

import dagger.Component;

@Component(modules = WheelsModules.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
