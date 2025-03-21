package com.VehicleFactoryInterface.java;

import com.VehicleInterface.java.Vehicle;

public interface VehicleFactory {
      

	Vehicle createVehicle(String type, String engineType);        
}
