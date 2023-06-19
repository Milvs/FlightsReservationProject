package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data @NoArgsConstructor
@Table(name = "seats")
public class Seat extends BaseEntity{


    private String seatNumber;

    @OneToOne(mappedBy = "seat", cascade = CascadeType.ALL)
    private Ticket ticket;

    @OneToMany(mappedBy = "seat", cascade = CascadeType.ALL)
    private Set<Flight> flights;

//    @OneToMany(mappedBy = "seat")
//    private Set<Seat> seat;


}
