package com.cesde.cityscooterapp.domain;

public class Vehicle {

    private int id;
    private String model;
    private boolean available;

    public Vehicle() {
    }

    public Vehicle(int id, String model, boolean available) {
        this.id = id;
        this.model = model;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}