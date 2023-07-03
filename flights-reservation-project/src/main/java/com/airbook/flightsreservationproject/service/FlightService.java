package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    public FlightRepo flightRepo;
}
