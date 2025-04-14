package com.VehiclefactoryImplementations.java;

import org.springframework.stereotype.Component;
import com.EngineImplementations.java.DieselEngine;
import com.EngineImplementations.java.ElectricEngine;
import com.EngineInterface.java.Engine;
import com.VehicleFactoryInterface.java.VehicleFactory;
import com.VehicleImplementations.java.Car;
import com.VehicleImplementations.java.Motorcycle;
import com.VehicleImplementations.java.Truck;
import com.VehicleInterface.java.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;


@Component  // Spring will recognize this as a bean
public class ConcreteVehicleFactory implements VehicleFactory {
    
    @Autowired
    private ElectricEngine electricEngine;
    
    @Autowired
    private DieselEngine dieselEngine;

    @Override
    public Vehicle createVehicle(String type, String engineType) {
        Engine engine = engineType.equalsIgnoreCase("Electric") ? electricEngine : dieselEngine;
        
        switch (type.toLowerCase()) {
            case "car": return new Car(engine, 4);
            case "truck": return new Truck(engine, 5000);
            case "motorcycle": return new Motorcycle(engine, false);
            default: throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
