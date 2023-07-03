package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.repository.PassengerRepo;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
    @Autowired
    public PassengerRepo passengerRepo;
}
