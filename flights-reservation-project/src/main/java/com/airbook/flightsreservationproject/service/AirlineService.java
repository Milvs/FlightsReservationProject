package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.models.Airline;
import com.airbook.flightsreservationproject.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AirlineService {
    @Autowired
    private AirlineRepository airlineRepository;

    @PostConstruct
    public void saveRecords(){
        if(airlineRepository.findAll().size() == 0){
            airlineRepository.save(new Airline("Bulgaria Air", "Bulgaria", "Sofia", "SF-12"));
            airlineRepository.save(new Airline("Turkish Airlines", "Turkey", "Istanbul", "TR-72"));
        }
    }
}
