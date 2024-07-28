package com.alibou.security.hickmet.repository;

import com.alibou.security.hickmet.model.Notification;
import com.alibou.security.hickmet.model.Program;
import com.alibou.security.hickmet.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
    List<Program> findByTripId(Long tripId);
}