package com.alibou.security.hickmet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String description;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "pilgrim_id")
    private Pilgrim pilgrim;
}
