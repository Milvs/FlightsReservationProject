package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.models.Passenger;
import com.airbook.flightsreservationproject.models.Ticket;
import com.airbook.flightsreservationproject.repository.PassengerRepo;
import com.airbook.flightsreservationproject.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    public TicketRepo ticketRepo;

    public void deleteTicketById(long id){
        ticketRepo.delete(id);

    }
    public Ticket createTicket(Ticket ticket){
        Ticket createdTicket = new Ticket(ticket.getTicketNumber());
        ticketRepo.create(createdTicket);
        return createdTicket;
    }
    public List<Ticket> readAllTickets(){
        return ticketRepo.findAll();
    }
}
