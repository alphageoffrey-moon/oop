package com.example.vehicle;

/**
 * Motorcycle is a child class of Vehicle.
 * It also overrides move() in its own way.
 */
public class Motorcycle extends Vehicle {

    public Motorcycle() {
    }

    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public String move() {
        return getBrand() + " motorcycle is riding on the road.";
    }
}
