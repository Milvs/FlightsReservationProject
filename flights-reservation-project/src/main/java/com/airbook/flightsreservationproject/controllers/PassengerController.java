package com.airbook.flightsreservationproject.controllers;

import com.airbook.flightsreservationproject.dto.PassengerDTO;
import com.airbook.flightsreservationproject.models.Customer;
import com.airbook.flightsreservationproject.models.Passenger;
import com.airbook.flightsreservationproject.service.CustomerService;
import com.airbook.flightsreservationproject.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/air")
public class PassengerController {
    @Autowired
    public PassengerService passengerService;

    @RequestMapping(value = "/passengers", method = RequestMethod.POST)
    public void createPassenger(@RequestBody PassengerDTO passenger) {
        passengerService.createPassenger(passenger);
    }

    @RequestMapping(value = "/passengers", method = RequestMethod.GET)
    public List<PassengerDTO> readAllPassengers() {
        return passengerService.readAllPassengers();
    }

    @RequestMapping(value = "/passengers/{id}", method = RequestMethod.DELETE)
    public void deletePassengerById(@PathVariable long id) {
        passengerService.deletePassengerById(id);
    }
}
