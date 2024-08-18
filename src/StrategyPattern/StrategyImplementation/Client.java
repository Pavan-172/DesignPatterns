package StrategyPattern.StrategyImplementation;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new SpeedVehicle();
        vehicle.drive();
    }
}
