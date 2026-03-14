package com.cesde.cityscooterapp.domain;

public class Scooter extends Vehicle {

    private int batteryLevel;

    public Scooter() {
    }

    public Scooter(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
//laura rojas marin