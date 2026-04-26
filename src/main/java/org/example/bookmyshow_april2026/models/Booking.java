package org.example.bookmyshow_april2026.models;

import java.util.Date;
import java.util.List;

public class Booking extends BaseModel {
    private BookingStatus status;
    private List<Payment> payments;
    private List<ShowSeat> showSeats;
    private Double amount;
    private Date time;
    private User user;
    private Show show;
}
