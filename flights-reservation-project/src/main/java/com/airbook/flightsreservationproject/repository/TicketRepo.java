package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepo extends BaseRepo<Ticket>{
    @Override
    public String getEntityName() {
        return Ticket.class.getSimpleName();
    }
}
