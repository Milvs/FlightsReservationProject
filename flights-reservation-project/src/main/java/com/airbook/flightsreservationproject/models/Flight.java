package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "flights")
public class Flight extends BaseEntity{


    @ManyToOne
    @JoinColumn(name = "airline_id",nullable = false)
    private Airline airline;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id",nullable = false)
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id",nullable = false)
    private Airport arrivalAirport;

    @ManyToOne
    @JoinColumn(name = "seat_id",nullable = false)
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "booking_id",nullable = false)
    private Booking booking;

    private String flightCode;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;


}
