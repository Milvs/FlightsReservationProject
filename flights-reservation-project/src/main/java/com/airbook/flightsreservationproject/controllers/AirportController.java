package com.airbook.flightsreservationproject.controllers;

import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.repository.AirportRepo;
import com.airbook.flightsreservationproject.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/air")
public class AirportController {

    @Autowired
    public AirportService airportService;
@Autowired AirportRepo airportRepo;

    @RequestMapping(value = "/airports",method = RequestMethod.POST)
    public void createAirport(@RequestBody Airport airport){
        airportService.airportRepo.create(airport);

    }

    @RequestMapping(value = "/airports",method = RequestMethod.GET)
    public List<Airport> readAirports(){
        return airportRepo.findAll();

    }
}
