package StrategyPattern.Strategies;

import StrategyPattern.StrategyImplementation.Vehicle;

public class NormalVehicleStrategy implements VehicleStrategy {

    @Override
    public void drive() {
        System.out.println("Driving normal vehicle");
    }
}
