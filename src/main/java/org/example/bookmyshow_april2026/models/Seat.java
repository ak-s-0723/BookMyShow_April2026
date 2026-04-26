package org.example.bookmyshow_april2026.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

@Entity
public class Seat extends BaseModel {
    private String number;
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    private Integer rn;
    private Integer cn;
}
