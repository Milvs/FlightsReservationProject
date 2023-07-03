package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Booking;
import org.springframework.stereotype.Repository;

@Repository

public class BookingRepo extends BaseRepo<Booking> {
    @Override
    public String getEntityName() {
        return Booking.class.getSimpleName();
    }
}
