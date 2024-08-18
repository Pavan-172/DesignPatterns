package StrategyPattern.StrategyImplementation;

import StrategyPattern.Strategies.NormalVehicleStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalVehicleStrategy());
    }
}
