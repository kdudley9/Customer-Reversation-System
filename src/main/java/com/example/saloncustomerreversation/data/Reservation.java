package com.example.saloncustomerreversation.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="RESERVATION")
public class Reservation {
    @Id
    @Column(name="RESERVATION")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;

    @Column(name="STYLIST_ID")
    private long stylistId;

    @Column(name="CUSTOMER_ID")
    private long customerId;

    @Column(name="RESERVATION_DATE")
    private Date reservationDate;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getStylistId() {
        return stylistId;
    }

    public void setStylistId(long stylistId) {
        this.stylistId = stylistId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
