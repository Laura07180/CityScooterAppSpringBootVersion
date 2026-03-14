package com.cesde.cityscooterapp.domain;

public class Admin extends User {

    private String role;

    public Admin() {
    }

    public Admin(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
//laura rojas marin