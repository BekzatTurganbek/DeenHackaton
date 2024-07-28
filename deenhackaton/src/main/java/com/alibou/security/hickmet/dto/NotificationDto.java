package com.alibou.security.hickmet.dto;

import lombok.Data;

@Data
public class NotificationDto {
    private Long pilgrimId;
    private String text;
    private String description;
}