package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Seat;
import org.springframework.stereotype.Repository;

@Repository

public class SeatRepo extends BaseRepo<Seat>{
    @Override
    public String getEntityName() {
        return Seat.class.getSimpleName();
    }
}
