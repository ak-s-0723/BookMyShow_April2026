package org.example.bookmyshow_april2026.models;

import java.util.List;

public class Movie extends BaseModel {
    private String name;
    private List<String> actors;
    private Double rating;
    private Genre genre;
    private Long duration;
    private String description;
    private List<String> languages;

}
