package com.garage.models;

public class Motor {

    private String name;
    private FuelType fuel;

    public Motor(String name, FuelType fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
