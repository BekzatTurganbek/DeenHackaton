package com.alibou.security.hickmet.controller;

import com.alibou.security.hickmet.dto.NotificationDto;
import com.alibou.security.hickmet.model.Notification;
import com.alibou.security.hickmet.service.NotificationService;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/notification")
@Hidden
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/{pilgrimId}")
    public List<Notification> getNotifications(
            @PathVariable Long pilgrimId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        return notificationService.getNotificationsByDateRange(pilgrimId, startDate, endDate);
    }

    @PostMapping("/pilgrimId")
    public Notification sendNotification(@RequestBody NotificationDto notificationDto) {
        return notificationService.sendNotification(notificationDto.getPilgrimId(), notificationDto.getText(), notificationDto.getDescription());
    }
    @PostMapping("/all")
    public Notification sendNotificationAll(@RequestBody NotificationDto notificationDto) {
        return notificationService.sendNotificationAll(notificationDto.getText(), notificationDto.getDescription());
    }

    @GetMapping("/all")
    public List<Notification> getAllNotification() {
        return notificationService.getAllNotification();
    }
}
