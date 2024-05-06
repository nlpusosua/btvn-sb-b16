package com.example.movieapp.entity;

import com.example.movieapp.model.enums.MovieType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String slug;

    String description;

    String poster;

    @Column(name = "release_year")
    Integer releaseYear;

    Double rating;

    @Enumerated(EnumType.STRING)
    MovieType type;

    Boolean status;

    String trailer;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;

    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}