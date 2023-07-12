package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "flights")
public class Flight extends BaseEntity {

    public Flight(Airline airline, Airport departureAirport, Airport arrivalAirport,
                  Seat seat, Booking booking, String flightCode,
                  LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.airline = airline;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.seat = seat;
        this.booking = booking;
        this.flightCode = flightCode;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    @ManyToOne
    @JoinColumn(name = "airline_id", nullable = false)
    private Airline airline;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    private Airport arrivalAirport;

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    private String flightCode;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Airline getAirline() {
        return airline;
    }

    public Seat getSeat() {
        return seat;
    }

    public Booking getBooking() {
        return booking;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }



    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Flight { flightCode = ").append(getFlightCode());
        sb.append(", departureTime = ").append(getDepartureTime());
        sb.append(", arrivalTime = ").append(getArrivalTime());
        sb.append(", departureAirport = ").append(getDepartureAirport());
        sb.append(", arrivalAirport = ").append(getArrivalAirport());
        sb.append(" }");
        return sb.toString();
    }
}
