package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.Rental;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentalService {

    private List<Rental> rentals = new ArrayList<>();

    public List<Rental> getRentals() {
        return rentals;
    }

    public Rental saveRental(Rental rental) {
        rentals.add(rental);
        return rental;
    }
}