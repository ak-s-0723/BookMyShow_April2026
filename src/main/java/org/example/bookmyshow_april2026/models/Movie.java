package org.example.bookmyshow_april2026.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

@Entity
public class Movie extends BaseModel {
    private String name;
    @ElementCollection
    private List<String> actors;
    private Double rating;
    @Enumerated(EnumType.ORDINAL)
    private Genre genre;
    private Long duration;
    private String description;
    @ElementCollection
    private List<String> languages;
}
