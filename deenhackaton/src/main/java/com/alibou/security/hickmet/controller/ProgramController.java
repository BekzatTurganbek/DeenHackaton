package com.alibou.security.hickmet.controller;

import com.alibou.security.hickmet.model.Program;
import com.alibou.security.hickmet.model.Trip;
import com.alibou.security.hickmet.service.ProgramService;
import com.alibou.security.hickmet.service.TripService;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/programs")
@Hidden
public class ProgramController {

    @Autowired
    private ProgramService programService;
    @GetMapping("/{tripId}")
    public List<Program> getPrograms(@PathVariable Long tripId) {
        return programService.getProgramByTrips(tripId);
    }

}
