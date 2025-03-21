package com.VehicleImplementations.java;

import com.EngineInterface.java.Engine;
import com.VehicleInterface.java.Vehicle;

public class Motorcycle implements Vehicle {
    private Engine engine;
    private boolean hasSidecar;

    public Motorcycle(Engine engine, boolean hasSidecar) {
        this.engine = engine;
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getDescription() {
        return "Motorcycle with " + engine.getEngineType() + " engine and " + (hasSidecar ? "a sidecar." : "no sidecar.");
    }
}