package com.VehicleService.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VehicleFactoryInterface.java.VehicleFactory;
import com.VehicleInterface.java.Vehicle;

@Service
public class VehicleService {
    @Autowired
    private VehicleFactory vehicleFactory;

    public String createVehicle(String type, String engineType) {
        Vehicle vehicle = vehicleFactory.createVehicle(type, engineType);
        return vehicle.getDescription();
    }
}