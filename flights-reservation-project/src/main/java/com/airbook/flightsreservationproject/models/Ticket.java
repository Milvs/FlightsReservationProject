package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ticketNumber;
    @OneToOne
    private Seat seat;
    @OneToOne
    private Passenger passenger;
}
