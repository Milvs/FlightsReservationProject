package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Airport;
import org.springframework.stereotype.Repository;

@Repository
public class AirportRepo extends BaseRepo<Airport>{


    @Override
    public String getEntityName() {
        return Airport.class.getSimpleName();
    }
}
