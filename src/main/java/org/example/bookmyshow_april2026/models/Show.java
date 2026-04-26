package org.example.bookmyshow_april2026.models;

import java.util.Date;
import java.util.List;

public class Show extends BaseModel {
    private Theatre theatre;
    private Movie movie;
    private Date time;
    private Screen screen;
    private List<ShowSeat> showSeats;
    private List<ShowSeatType> showSeatTypes;
}
