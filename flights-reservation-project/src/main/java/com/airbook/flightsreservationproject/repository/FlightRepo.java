package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Flight;
import org.springframework.stereotype.Repository;

@Repository

public class FlightRepo extends  BaseRepo<Flight>{
    @Override
    public String getEntityName() {
        return null;
    }
}
