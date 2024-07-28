package com.alibou.security.hickmet.controller;

import com.alibou.security.hickmet.dto.PilgrimDto;
import com.alibou.security.hickmet.model.Pilgrim;
import com.alibou.security.hickmet.service.PilgrimService;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/pilgrim")
@Hidden
public class PilgrimController {

    @Autowired
    PilgrimService pilgrimService;

    @GetMapping("/info/{id}")
    public ResponseEntity<PilgrimDto> getPilgrimById(@PathVariable Long id) {
        Optional<PilgrimDto> pilgrimDto = pilgrimService.getPilgrimById(id);
        if (pilgrimDto.isPresent()) {
            return ResponseEntity.ok(pilgrimDto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
