package com.airbook.flightsreservationproject.dto;

import com.airbook.flightsreservationproject.models.Booking;
import lombok.NoArgsConstructor;

import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@NoArgsConstructor
public class CustomerDTO {

    private String username;
    private String email;
    private String password;
    private Set<BookingDTO> bookings ;

//    public CustomerDTO(String username, String email, Set<BookingDTO> bookings) {
//        this.username = username;
//        this.email = email;
//        this.bookings = bookings;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<BookingDTO> getBookings() {
        return bookings;
    }

    public void setBookings(Set<BookingDTO> bookings) {
        this.bookings = bookings;
    }
}


