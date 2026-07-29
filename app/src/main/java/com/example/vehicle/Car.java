package com.example.vehicle;

/**
 * Car is a child class of Vehicle.
 * It inherits brand information from Vehicle and gives its own move() behavior.
 */
public class Car extends Vehicle {

    public Car() {
    }

    public Car(String brand) {
        super(brand);
    }

    @Override
    public String move() {
        return getBrand() + " car is driving on the road.";
    }
}
