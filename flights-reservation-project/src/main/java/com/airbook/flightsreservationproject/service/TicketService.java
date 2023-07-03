package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    public TicketRepo ticketRepo;
}
