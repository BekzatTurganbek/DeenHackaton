package com.alibou.security.hickmet.service;

import com.alibou.security.hickmet.model.Notification;
import com.alibou.security.hickmet.model.Program;
import com.alibou.security.hickmet.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProgramService {

    @Autowired
    ProgramRepository programRepository;
    public List<Program> getProgramByTrips(Long tripId) {
        return programRepository.findByTripId(tripId);
    }
}
