package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.Scooter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScooterService {

    private List<Scooter> scooters = new ArrayList<>();

    public List<Scooter> getScooters() {
        return scooters;
    }

    public Scooter saveScooter(Scooter scooter) {
        scooters.add(scooter);
        return scooter;
    }
}