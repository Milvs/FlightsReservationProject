package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data @NoArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String seatNumber;

    @OneToMany(mappedBy = "seat")
    private Set<Flight> flights;

    @OneToMany(mappedBy = "seat")
    private Set<Seat> seat;


}
