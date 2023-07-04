package com.airbook.flightsreservationproject.controllers;

import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.repository.AirportRepo;
import com.airbook.flightsreservationproject.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/air")
public class AirportController {

    @Autowired
    public AirportService airportService;

    @RequestMapping(value = "/airports", method = RequestMethod.POST)
    public void createAirport(@RequestBody Airport airport) {
        airportService.createAirport(airport);
    }

    @RequestMapping(value = "/airports", method = RequestMethod.GET)
    public List<Airport> readAllAirports() {
        return airportService.readAllAirports();
    }
    @RequestMapping(value = "/airports/{id}", method = RequestMethod.DELETE)
    public void deleteAirportById(@PathVariable long id) {
        airportService.deleteAirportById(id);
    }
}
