package com.cesde.cityscooterapp.domain;

public class Rental {
    private int id;
    private String startDate;
    private String endDate;
    private Customer customer;
    private Scooter scooter;

    public Rental() {
    }

    public Rental(int id, String startDate, String endDate, Customer customer, Scooter scooter) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.scooter = scooter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }
    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customer=" + customer +
                ", scooter=" + scooter +
                '}';
    }
}
//laura rojas marin