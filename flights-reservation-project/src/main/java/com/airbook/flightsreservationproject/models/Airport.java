package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "airports")
public class Airport extends BaseEntity{

    @OneToMany(mappedBy = "departureAirport", cascade = CascadeType.ALL)
    private Set<Flight> departureFlights;

    @OneToMany(mappedBy = "arrivalAirport", cascade = CascadeType.ALL)
    private Set<Flight> arrivalFlights;

    private  String name;

}
