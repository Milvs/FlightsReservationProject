package com.airbook.flightsreservationproject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity

@NoArgsConstructor
@Table(name = "airports")
public class Airport extends BaseEntity {


    @OneToMany(mappedBy = "departureAirport", cascade = CascadeType.ALL)
    private Set<Flight> departureFlights;

    @OneToMany(mappedBy = "arrivalAirport", cascade = CascadeType.ALL)
    private Set<Flight> arrivalFlights;

    private String name;

    public Set<Flight> getDepartureFlights() {
        return departureFlights;
    }

    public void setDepartureFlights(Set<Flight> departureFlights) {
        this.departureFlights = departureFlights;
    }

    public Set<Flight> getArrivalFlights() {
        return arrivalFlights;
    }

    public void setArrivalFlights(Set<Flight> arrivalFlights) {
        this.arrivalFlights = arrivalFlights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Airport(String name) {
        this.name = name;
    }
}
