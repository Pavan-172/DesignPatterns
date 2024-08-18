package StrategyPattern.StrategyImplementation;

import StrategyPattern.Strategies.SportsVehicleStrategy;

public class SpeedVehicle extends Vehicle {

    public SpeedVehicle() {
        super(new SportsVehicleStrategy());
    };
}
