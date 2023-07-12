package com.airbook.flightsreservationproject.dto;

import com.airbook.flightsreservationproject.models.Booking;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
public class PassengerDTO {
    private String name;
    private Set<BookingDTO> bookings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookingDTO> getBookings() {
        return bookings;
    }

    public void setBookings(Set<BookingDTO> bookings) {
        this.bookings = bookings;
    }


}
