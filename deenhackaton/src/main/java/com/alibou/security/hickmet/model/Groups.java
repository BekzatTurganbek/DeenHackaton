package com.alibou.security.hickmet.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "groups")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "group", fetch = FetchType.EAGER)
    private List<Pilgrim> pilgrims;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;
}

