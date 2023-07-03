package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.repository.AirportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AirportService {
    @Autowired
    public AirportRepo airportRepo;

    @Transactional
    public void invoke() {
        Airport airport = new Airport("London Heathrow Airport");
        airportRepo.create(airport);

    }
}
