package org.example.bookmyshow_april2026.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

@Entity
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Show_ show_;
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    private Double price;
}
