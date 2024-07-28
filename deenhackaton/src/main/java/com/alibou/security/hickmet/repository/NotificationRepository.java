package com.alibou.security.hickmet.repository;

import com.alibou.security.hickmet.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByPilgrimIdAndDateBetween(Long pilgrimId, LocalDateTime startDate, LocalDateTime endDate);

    List<Notification> findAll();
}
