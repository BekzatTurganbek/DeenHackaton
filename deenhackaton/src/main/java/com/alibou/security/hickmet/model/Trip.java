package com.alibou.security.hickmet.model;

import com.alibou.security.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate tripDate;
    private int daysCount;
    private String packageName;
    private String departureLocation;

}
