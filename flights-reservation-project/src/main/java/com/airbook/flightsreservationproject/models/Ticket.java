package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
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

//    @OneToOne
//    @JoinColumn(name = "ticket")
//    private Passenger passenger;
}
