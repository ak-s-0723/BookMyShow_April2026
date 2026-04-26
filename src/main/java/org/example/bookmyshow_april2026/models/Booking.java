package org.example.bookmyshow_april2026.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Booking extends BaseModel {
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;
    @OneToMany(mappedBy = "booking")
    private List<Payment> payments;
    @OneToMany
    private List<ShowSeat> showSeats;
    private Double amount;
    private Date time;
    @ManyToOne
    private User user;
    @ManyToOne
    private Show_ show_;
}
