package com.airbook.flightsreservationproject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "passengers")
public class Passenger extends BaseEntity {

    private String name;
    private String passportNumber;


    @JsonIgnore
    @OneToOne(mappedBy = "passenger", cascade = CascadeType.ALL)//non-owning side
    private Ticket tickets;


    @OneToMany(mappedBy = "passenger",cascade = CascadeType.ALL)
    private Set<Booking> bookings;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Ticket getTickets() {
        return tickets;
    }

    public void setTickets(Ticket tickets) {
        this.tickets = tickets;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }
}
// parent е класа който има референциа към child класа