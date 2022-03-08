package com.garage.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Car extends Vehicle{

    private Integer taxHorsepower;
    private Integer numberOfDoors;
    private Integer numberOfSeats;
    private Integer trunkSize;

    public Car(String name, Integer price, Integer weight, LocalDateTime createAt, Color color, Brand brand, Motor motor, ArrayList<Option> option, Integer taxHorsepower, Integer numberOfDoors, Integer numberOfSeats, Integer trunkSize) {
        super(name, price, weight, createAt, color, brand, motor, option);
        this.taxHorsepower = taxHorsepower;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.trunkSize = trunkSize;
    }

    public Integer getTaxHorsepower() {
        return taxHorsepower;
    }

    public void setTaxHorsepower(Integer taxHorsepower) {
        this.taxHorsepower = taxHorsepower;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(Integer trunkSize) {
        this.trunkSize = trunkSize;
    }
}
