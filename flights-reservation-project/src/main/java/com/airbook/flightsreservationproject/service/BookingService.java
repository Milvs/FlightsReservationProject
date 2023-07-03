package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.models.Booking;
import com.airbook.flightsreservationproject.models.Flight;
import com.airbook.flightsreservationproject.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    public BookingRepo bookingRepo;
}
