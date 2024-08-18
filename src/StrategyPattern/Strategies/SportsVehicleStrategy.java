package StrategyPattern.Strategies;

public class SportsVehicleStrategy implements VehicleStrategy {

    @Override
    public void drive(){
        System.out.println("Driving Sports Vehicle");
    }
}
