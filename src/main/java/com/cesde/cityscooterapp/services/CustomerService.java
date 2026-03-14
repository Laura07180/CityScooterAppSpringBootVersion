package com.cesde.cityscooterapp.services;


import com.cesde.cityscooterapp.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer saveCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }
}