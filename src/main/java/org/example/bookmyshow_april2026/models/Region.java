package org.example.bookmyshow_april2026.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Region extends BaseModel {
    private String name;
    @OneToMany
    private List<Theatre> theatres;
}
