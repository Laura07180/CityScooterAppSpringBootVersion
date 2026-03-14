package com.cesde.cityscooterapp.domain;

public class Scooter {
    private int id;
    private String model;
    private int battery;
    private boolean available;

    public Scooter() {
    }

    public Scooter(int id, String model, int battery, boolean available) {
        this.id = id;
        this.model = model;
        this.battery = battery;
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

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return "Scooter{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", battery=" + battery +
                ", available=" + available +
                '}';
    }
}
