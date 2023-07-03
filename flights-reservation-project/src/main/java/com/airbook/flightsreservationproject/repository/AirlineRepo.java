package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Airline;
import org.springframework.stereotype.Repository;



@Repository
public class AirlineRepo extends BaseRepo<Airline>{ //generic later

@Override
    public String getEntityName() {
        return Airline.class.getSimpleName();
    }




}
