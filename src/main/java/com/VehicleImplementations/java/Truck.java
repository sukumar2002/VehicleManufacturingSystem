package com.VehicleImplementations.java;

import com.EngineInterface.java.Engine;
import com.VehicleInterface.java.Vehicle;

public class Truck implements Vehicle {
    private Engine engine;
    private int payloadCapacity;

    public Truck(Engine engine, int payloadCapacity) {
        this.engine = engine;
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String getDescription() {
        return "Truck with " + engine.getEngineType() + " engine and payload capacity of " + payloadCapacity + "kg.";
    }
}