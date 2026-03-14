package com.cesde.cityscooterapp.domain;

public class Customer extends User {

    private boolean status;

    public Customer() {
    }

    public Customer(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
// laura rojas marin