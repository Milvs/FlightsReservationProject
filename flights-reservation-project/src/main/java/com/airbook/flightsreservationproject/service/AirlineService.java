package com.airbook.flightsreservationproject.service;


import com.airbook.flightsreservationproject.models.Airline;
import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.repository.AirlineRepo;
import com.airbook.flightsreservationproject.repository.AirportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class AirlineService {

    @Autowired
    public AirlineRepo airlineRepo;

    @Transactional
    public void invoke(){
        Airline airline = new Airline("Bulgaria Air", "Bulgaria", "Sofia", "BG-75");
        airlineRepo.create(airline);
       for (Airline a: airlineRepo.findAll()) {
           System.out.println(a.toString());

       }

    }


//    @Autowired
//    private AirlineRepository airlineRepository;
//
//    @PostConstruct
//    public void saveRecords() {
//        if (airlineRepository.findAll().size() == 0) {
//            airlineRepository.save(new Airline("Bulgaria Air", "Bulgaria", "Sofia", "SF-12"));
//            airlineRepository.save(new Airline("Turkish Airlines", "Turkey", "Istanbul", "TR-72"));
//        }
//    }


}
