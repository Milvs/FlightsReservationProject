package com.airbook.flightsreservationproject.controllers;

import com.airbook.flightsreservationproject.dto.BookingDTO;
import com.airbook.flightsreservationproject.models.Booking;
import com.airbook.flightsreservationproject.models.Customer;
import com.airbook.flightsreservationproject.service.BookingService;
import com.airbook.flightsreservationproject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/air")
public class BookingController {
    @Autowired
    public BookingService bookingService;

    @RequestMapping(value = "/bookings", method = RequestMethod.POST)
    public void createBooking(@RequestBody BookingDTO booking) {
        bookingService.createBooking(booking);
    }

    @RequestMapping(value = "/bookings", method = RequestMethod.GET)
    public List<BookingDTO> readAllBookings() {
        return bookingService.readAllBookings();
    }

    @RequestMapping(value = "/bookings/{id}", method = RequestMethod.DELETE)
    public void deleteBookingById(@PathVariable long id) {
        bookingService.deleteBookingById(id);
    }
}
