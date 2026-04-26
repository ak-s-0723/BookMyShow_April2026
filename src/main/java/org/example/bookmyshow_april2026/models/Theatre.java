package org.example.bookmyshow_april2026.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Theatre extends BaseModel {
    private String name;
    private String address;
    @OneToMany
    private List<Screen> screens;
    @OneToMany
    private List<Movie> movies;
    private Double rating;

}
