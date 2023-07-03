package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepo customerRepo;
}
