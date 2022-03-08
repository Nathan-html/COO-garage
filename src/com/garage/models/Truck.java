package com.garage.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Truck extends Vehicle {

    private Integer numberOfAxles;
    private Integer loadingWeight;
    private Integer loadingVolume;

    public Truck(String name, Integer price, Integer weight, LocalDateTime createAt, Color color, Brand brand, Motor motor, ArrayList<Option> option, Integer numberOfAxles, Integer loadingWeight, Integer loadingVolume) {
        super(name, price, weight, createAt, color, brand, motor, option);
        this.numberOfAxles = numberOfAxles;
        this.loadingWeight = loadingWeight;
        this.loadingVolume = loadingVolume;
    }

    public Integer getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(Integer numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public Integer getLoadingWeight() {
        return loadingWeight;
    }

    public void setLoadingWeight(Integer loadingWeight) {
        this.loadingWeight = loadingWeight;
    }

    public Integer getLoadingVolume() {
        return loadingVolume;
    }

    public void setLoadingVolume(Integer loadingVolume) {
        this.loadingVolume = loadingVolume;
    }
}
