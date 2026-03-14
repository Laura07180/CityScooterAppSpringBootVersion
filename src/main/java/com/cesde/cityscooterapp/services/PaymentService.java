package com.cesde.cityscooterapp.services;


import com.cesde.cityscooterapp.domain.Payment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

    private List<Payment> payments = new ArrayList<>();

    public List<Payment> getPayments() {
        return payments;
    }

    public Payment savePayment(Payment payment) {
        payments.add(payment);
        return payment;
    }
}