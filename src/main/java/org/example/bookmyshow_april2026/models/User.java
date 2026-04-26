package org.example.bookmyshow_april2026.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class User extends BaseModel {
    private String emailId;
    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
    private String name;
}
