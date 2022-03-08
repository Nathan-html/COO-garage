package com.garage.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bike extends Vehicle{

    private Integer cylinderCapacity;

    public Bike(String name, Integer price, Integer weight, LocalDateTime createAt, Color color, Brand brand, Motor motor, ArrayList<Option> option, Integer cylinderCapacity) {
        super(name, price, weight, createAt, color, brand, motor, option);
        this.cylinderCapacity = cylinderCapacity;
    }

    public Integer getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(Integer cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }
}
