package com.airbook.flightsreservationproject.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "seats")
public class Seat extends BaseEntity{
    private String seatNumber;

    @OneToOne(mappedBy = "seat", cascade = CascadeType.ALL)
    private Ticket ticket;

    @OneToMany(mappedBy = "seat", cascade = CascadeType.ALL)
    private Set<Flight> flights;

    public void setFlights(Set<Flight> flights) {
        this.flights = flights;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    //    @OneToMany(mappedBy = "seat")
//    private Set<Seat> seat;


}
