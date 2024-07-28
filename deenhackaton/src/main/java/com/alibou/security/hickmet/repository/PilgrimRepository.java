package com.alibou.security.hickmet.repository;

import com.alibou.security.hickmet.model.Pilgrim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PilgrimRepository extends JpaRepository<Pilgrim, Long> {

}
