package com.cesde.cityscooterapp.domain;

public class Payment {

    private int id;
    private double amount;
    private String paymentMethod;
    private Booking booking;

    public Payment() {
    }

    public Payment(int id, double amount, String paymentMethod, Booking booking) {
        this.id = id;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.booking = booking;
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


    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

}