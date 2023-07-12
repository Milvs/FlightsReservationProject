package com.airbook.flightsreservationproject.controllers;

import com.airbook.flightsreservationproject.models.Customer;
import com.airbook.flightsreservationproject.models.Flight;
import com.airbook.flightsreservationproject.service.CustomerService;
import com.airbook.flightsreservationproject.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/air")
public class FlightController {
    @Autowired
    public FlightService flightService;

    @RequestMapping(value = "/flights", method = RequestMethod.POST)
    public void createFlight(@RequestBody Flight flight) {
        flightService.createFlight(flight);
    }

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public List<Flight> readAllFlights() {
        return flightService.readAllFlights();
    }

    @RequestMapping(value = "/flights/{id}", method = RequestMethod.DELETE)
    public void deleteFlightsById(@PathVariable long id) {
        flightService.deleteFlightById(id);
    }
}
