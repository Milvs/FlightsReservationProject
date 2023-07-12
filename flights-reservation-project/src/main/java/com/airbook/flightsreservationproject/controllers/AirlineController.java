package com.airbook.flightsreservationproject.controllers;

import com.airbook.flightsreservationproject.models.Airline;
import com.airbook.flightsreservationproject.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/air")
public class AirlineController {
    @Autowired
    public AirlineService airlineService;

    @RequestMapping(value = "/airlines", method = RequestMethod.POST)
    public void createAirline(@RequestBody Airline airline) {
        airlineService.createAirline(airline);
    }

    @RequestMapping(value = "/airlines", method = RequestMethod.GET)
    public List<Airline> readAllAirlines() {
        return airlineService.readAllAirlines();
    }
    @RequestMapping(value = "/airlines/{id}", method = RequestMethod.DELETE)
    public void deleteAirlineById(@PathVariable long id) {
        airlineService.deleteAirlineById(id);
    }
}
