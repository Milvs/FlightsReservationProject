package com.airbook.flightsreservationproject.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "departureAirport")
    private Set<Flight> departureFlights;

    @OneToMany(mappedBy = "arrivalAirport")
    private Set<Flight> arrivalFlights;

    private  String name;
}
