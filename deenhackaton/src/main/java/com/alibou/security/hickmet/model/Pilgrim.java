    package com.alibou.security.hickmet.model;

    import lombok.Data;
    import lombok.NoArgsConstructor;

    import jakarta.persistence.*;

    @Data
    @NoArgsConstructor
    @Entity
    public class Pilgrim {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String lastName;
        private String photo;
        private int age;
        private String birthCity;
        private String roomNumber;
        private String phoneNumber;
        private String whatsapp;
        private String telegram;
        private String location;
        private String specialNotes;
        private String visa;
        private String insurance;

        @ManyToOne
        @JoinColumn(name = "group_id")
        private Groups group;
    }
