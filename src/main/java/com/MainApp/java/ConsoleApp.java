package com.MainApp.java;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.VehicleService.java.VehicleService;
public class ConsoleApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.Appconfig.java");
        VehicleService vehicleService = context.getBean(VehicleService.class);  
        String result = vehicleService.createVehicle("truck", "Electric");
        System.out.println(result);
    }
}
