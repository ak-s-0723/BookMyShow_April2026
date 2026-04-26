package org.example.bookmyshow_april2026.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Show_ extends BaseModel {
    @ManyToOne
    private Theatre theatre;
    @ManyToOne
    private Movie movie;
    private Date time;
    @ManyToOne
    private Screen screen;
    @OneToMany(mappedBy = "show_")
    private List<ShowSeat> showSeats;
    @OneToMany(mappedBy = "show_")
    private List<ShowSeatType> showSeatTypes;
}
