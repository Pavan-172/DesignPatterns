package StrategyPattern.Strategies;

import StrategyPattern.StrategyImplementation.Vehicle;

public class SuvVehicleStrategy implements VehicleStrategy {

    @Override
    public void drive() {
        System.out.println("Suv Vehicle");
    }
}
