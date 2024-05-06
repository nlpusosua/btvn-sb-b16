package com.example.movieapp.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "episodes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String name;

    Integer duration;

    String videoUrl;

    Integer order;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    Movies movie;

    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
