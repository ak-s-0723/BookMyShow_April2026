package org.example.bookmyshow_april2026.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Payment extends BaseModel {
    private String PaymentGatewayReferenceId;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
    private Double amount;
    private Date time;
    @ManyToOne
    private Booking booking;
}
