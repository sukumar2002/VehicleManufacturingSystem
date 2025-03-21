package com.VehicleImplementations.java;

import com.EngineInterface.java.Engine;
import com.VehicleInterface.java.Vehicle;

public class Car implements Vehicle {
    private Engine engine;
    private int doors;
    
    public Car(Engine engine, int doors) {
        this.engine = engine;
        this.doors = doors;
    }

    @Override
    public String getDescription() {
        return "Car with " + engine.getEngineType() + " engine and " + doors + " doors.";
    }
}