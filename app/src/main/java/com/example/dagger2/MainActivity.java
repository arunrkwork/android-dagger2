package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2.car.Car;
import com.example.dagger2.dagger.CarComponent;
import com.example.dagger2.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /*
        Example of Field Injection
    */

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        //car = component.getCar();
        component.inject(this); // call instead of above line
        car.drive();

    }
}
