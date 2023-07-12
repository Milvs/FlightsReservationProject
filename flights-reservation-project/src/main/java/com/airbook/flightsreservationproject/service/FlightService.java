package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.models.Airline;
import com.airbook.flightsreservationproject.models.Booking;
import com.airbook.flightsreservationproject.models.Flight;
import com.airbook.flightsreservationproject.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    public FlightRepo flightRepo;

    public void deleteFlightById(long id){
        flightRepo.delete(id);

    }
    public Flight createFlight(Flight flight){
        Flight createdFlight = new Flight(flight.getAirline(), flight.getDepartureAirport(), flight.getArrivalAirport(), flight.getSeat(), flight.getBooking(),
                flight.getFlightCode(),flight.getDepartureTime(),flight.getArrivalTime());
        flightRepo.create(createdFlight);
        return createdFlight;
    }
    public List<Flight> readAllFlights(){
        return flightRepo.findAll();
    }
}
