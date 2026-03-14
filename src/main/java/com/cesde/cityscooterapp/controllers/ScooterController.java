package com.cesde.cityscooterapp.controllers;

import com.cesde.cityscooterapp.domain.Scooter;
import com.cesde.cityscooterapp.services.ScooterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scooters")
public class ScooterController {

    private final ScooterService scooterService;

    public ScooterController(ScooterService scooterService) {
        this.scooterService = scooterService;
    }

    @GetMapping
    public List<Scooter> getScooters() {
        return scooterService.getScooters();
    }

    @PostMapping
    public Scooter saveScooter(@RequestBody Scooter scooter) {
        return scooterService.saveScooter(scooter);
    }
}
