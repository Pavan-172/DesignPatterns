package StrategyPattern.StrategyImplementation;

import StrategyPattern.Strategies.VehicleStrategy;

public class Vehicle {
    VehicleStrategy vehicleStrategy;

    public Vehicle(VehicleStrategy vehicleStrategy) {
        this.vehicleStrategy = vehicleStrategy;
    }

    public void drive(){
        vehicleStrategy.drive();
    }
}
