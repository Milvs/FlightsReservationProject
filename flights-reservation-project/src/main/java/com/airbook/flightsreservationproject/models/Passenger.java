package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data @NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String passportNumber;

    @OneToOne
    private Ticket tickets;

    @OneToMany(mappedBy = "passenger")
    private Set<Booking> bookings;
}
