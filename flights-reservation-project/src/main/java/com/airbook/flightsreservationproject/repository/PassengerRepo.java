package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Passenger;
import org.springframework.stereotype.Repository;

@Repository

public class PassengerRepo extends BaseRepo<Passenger>{
    @Override
    public String getEntityName() {
        return Passenger.class.getSimpleName();
    }
}
