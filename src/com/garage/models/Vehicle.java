package com.garage.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Vehicle {

    private String name;
    private Integer price;
    private Integer weight;
    private LocalDateTime createAt;
    private Color color;
    private Brand brand;
    private Motor motor;
    private ArrayList<Option> option;

    public Vehicle(String name, Integer price, Integer weight, LocalDateTime createAt, Color color, Brand brand, Motor motor, ArrayList<Option> option) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.createAt = createAt;
        this.color = color;
        this.brand = brand;
        this.motor = motor;
        this.option = option;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public ArrayList<Option> getOption() {
        return option;
    }

    public void setOption(ArrayList<Option> option) {
        this.option = option;
    }
}
