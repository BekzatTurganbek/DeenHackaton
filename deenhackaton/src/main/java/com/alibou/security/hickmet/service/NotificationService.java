package com.alibou.security.hickmet.service;

import com.alibou.security.hickmet.model.Notification;
import com.alibou.security.hickmet.model.Pilgrim;
import com.alibou.security.hickmet.repository.NotificationRepository;
import com.alibou.security.hickmet.repository.PilgrimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private PilgrimRepository pilgrimRepository;

    public List<Notification> getNotificationsByDateRange(Long pilgrimId, LocalDateTime startDate, LocalDateTime endDate) {
        return notificationRepository.findByPilgrimIdAndDateBetween(pilgrimId, startDate, endDate);
    }

    public Notification sendNotification(Long pilgrimId, String text, String description) {
        Optional<Pilgrim> pilgrimOptional = pilgrimRepository.findById(pilgrimId);
        if (pilgrimOptional.isPresent()) {
            Pilgrim pilgrim = pilgrimOptional.get();
            Notification notification = new Notification();
            notification.setText(text);
            notification.setDescription(description);
            notification.setDate(LocalDateTime.now());
            notification.setPilgrim(pilgrim);
            return notificationRepository.save(notification);
        }
        return null;
    }

    public Notification sendNotificationAll(String text, String description) {
        Notification notification = new Notification();
        notification.setText(text);
        notification.setDescription(description);
        return notificationRepository.save(notification);
    }

    public List<Notification> getAllNotification() {
        return notificationRepository.findAll();
    }
}
