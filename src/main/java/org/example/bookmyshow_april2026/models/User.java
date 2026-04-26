package org.example.bookmyshow_april2026.models;

import java.util.List;

public class User extends BaseModel {
    private String emailId;
    private List<Booking> bookings;
    private String name;
}
