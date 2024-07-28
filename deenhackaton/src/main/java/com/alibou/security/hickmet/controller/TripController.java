package com.alibou.security.hickmet.controller;

import com.alibou.security.hickmet.model.Trip;
import com.alibou.security.hickmet.service.TripService;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trips")
@Hidden
public class TripController {

    @Autowired
    private TripService tripService;
    @GetMapping
    public List<Trip> getTrips() {
        return tripService.getAllTrip();
    }

}
