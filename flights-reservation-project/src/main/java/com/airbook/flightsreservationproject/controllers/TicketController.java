package com.airbook.flightsreservationproject.controllers;

import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.models.Ticket;
import com.airbook.flightsreservationproject.service.AirportService;
import com.airbook.flightsreservationproject.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/air")
public class TicketController {

    @Autowired
    public TicketService ticketService;

    @RequestMapping(value = "/tickets", method = RequestMethod.POST)
    public void createTicket(@RequestBody Ticket ticket) {
        ticketService.createTicket(ticket);
    }

    @RequestMapping(value = "/tickets", method = RequestMethod.GET)
    public List<Ticket> readAllTickets() {
        return ticketService.readAllTickets();
    }

    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.DELETE)
    public void deleteTicketById(@PathVariable long id) {
        ticketService.deleteTicketById(id);
    }
}
