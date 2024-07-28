package com.alibou.security.hickmet.service;

import com.alibou.security.hickmet.model.Notification;
import com.alibou.security.hickmet.model.Trip;
import com.alibou.security.hickmet.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public List<Trip> getAllTrip() {
        return tripRepository.findAll();
    }

}
