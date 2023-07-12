package com.airbook.flightsreservationproject.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Table(name = "tickets")
public class Ticket extends BaseEntity{


    private String ticketNumber;

    @OneToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;


    @OneToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;



    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Ticket(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    //    @OneToOne
//    @JoinColumn(name = "ticket")
//    private Passenger passenger;



}
