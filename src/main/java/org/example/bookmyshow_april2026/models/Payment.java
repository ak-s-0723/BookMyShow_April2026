package org.example.bookmyshow_april2026.models;

import java.util.Date;

public class Payment extends BaseModel {
    private String PaymentGatewayReferenceId;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private Double amount;
    private Date time;
    private Booking booking;
}
