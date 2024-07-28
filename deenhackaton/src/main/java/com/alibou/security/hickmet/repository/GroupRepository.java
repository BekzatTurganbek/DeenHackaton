package com.alibou.security.hickmet.repository;

import com.alibou.security.hickmet.model.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Groups, Long> {
    List<Groups> findByTripId(Long tripId);
}