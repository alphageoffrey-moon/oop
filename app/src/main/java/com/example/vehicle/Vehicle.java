package com.example.vehicle;

/**
 * Vehicle is the abstract parent class.
 *
 * It demonstrates:
 * 1. Encapsulation: the brand field is private and accessed using getters and setters.
 * 2. Abstraction: move() is abstract, so every child class must explain how it moves.
 */
public abstract class Vehicle {

    private String brand;

    public Vehicle() {
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract String move();

    public String getInfo() {
        return "Vehicle Brand: " + brand;
    }
}
