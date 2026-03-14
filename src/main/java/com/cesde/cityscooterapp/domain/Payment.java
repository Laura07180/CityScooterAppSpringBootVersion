package com.cesde.cityscooterapp.domain;

public class Payment {
    private int id;
    private double amount;
    private String date;
    private Rental rental;

    public Payment() {
    }

    public Payment(int id, double amount, String date, Rental rental) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.rental = rental;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }
    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", rental=" + rental +
                '}';
    }
}
