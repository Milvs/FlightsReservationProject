package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.repository.AirportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AirportService {
    @Autowired
    public AirportRepo airportRepo;

    public void deleteAirportById(long id){
        airportRepo.delete(id);

    }
    public Airport createAirport(Airport airport){
        Airport createdAirport = new Airport(airport.getName());
        airportRepo.create(createdAirport);
        return createdAirport;
    }
    public List<Airport> readAllAirports(){
        return airportRepo.findAll();
    }

    @Transactional
    public void invoke() {
     airportRepo.delete(6L);

        }

    }

