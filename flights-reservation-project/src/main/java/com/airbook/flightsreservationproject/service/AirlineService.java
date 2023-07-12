package com.airbook.flightsreservationproject.service;


import com.airbook.flightsreservationproject.models.Airline;
import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.repository.AirlineRepo;
import com.airbook.flightsreservationproject.repository.AirportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class AirlineService {

    @Autowired
    public AirlineRepo airlineRepo;

    public void deleteAirlineById(long id){
        airlineRepo.delete(id);

    }
    public Airline createAirline(Airline airline){
        Airline createdAirline = new Airline(airline.getName(),airline.getCountry(),airline.getCity(),airline.getAirline_code());
        airlineRepo.create(createdAirline);
        return createdAirline;
    }
    public List<Airline> readAllAirlines(){
        return airlineRepo.findAll();
    }

    @Transactional
    public void invoke(){


    }





}
