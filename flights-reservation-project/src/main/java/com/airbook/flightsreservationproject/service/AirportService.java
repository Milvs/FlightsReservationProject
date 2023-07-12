package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.dto.*;
import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.models.Flight;
import com.airbook.flightsreservationproject.repository.AirportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AirportService {
    @Autowired
    public AirportRepo airportRepo;
    @Autowired
    public AirportDTOMapper airportDTOMapper;
    @Autowired
    public AirlineDTOMapper airlineDTOMapper;
    @Autowired
    public FlightDTOMapper flightDTOMapper;

    public void deleteAirportById(long id) {
        airportRepo.delete(id);

    }

    public AirportDTO createAirport(AirportDTO airport) {
        Airport createdAirport = airportDTOMapper.convertDtoToEntity(airport);
        airportRepo.create(createdAirport);
        return airportDTOMapper.convertEntityToDto(createdAirport);
    }

//    public List<AirportDTO> readAllAirports() {
//        List<Airport> airports = airportRepo.findAll();
//        List<AirportDTO> airportDTOList = airports.stream()
//                .map(airport -> {
//                    AirportDTO airportDTO = new AirportDTO();
//                    airportDTO.setName(airport.getName());
//                    Set<FlightDTO> depFlightDTOSet = airport.getDepartureFlights().stream()
//                            .map(depFlight -> {
//                                FlightDTO depFlightDTO = new FlightDTO();
//                                depFlightDTO.setFlightCode(depFlight.getFlightCode());
//                                depFlightDTO.setAirline(airlineDTOMapper.convertEntityToDto(depFlight.getAirline()));
//                                depFlightDTO.setDepartureTime(depFlight.getDepartureTime());
//                                depFlightDTO.setArrivalTime(depFlight.getArrivalTime());
////                                depFlightDTO.setDepartureAirport(airportDTOMapper.convertEntityToDto(depFlight.getDepartureAirport()));
////                                depFlightDTO.setArrivalAirport(airportDTOMapper.convertEntityToDto(depFlight.getArrivalAirport()));
//                                return depFlightDTO;
//                            }).collect(Collectors.toSet());
//
//                    Set<FlightDTO> arrFlightDTOSet = airport.getArrivalFlights().stream()
//                            .map(arrFlight -> {
//                                FlightDTO arrFlightDTO = new FlightDTO();
//                                arrFlightDTO.setFlightCode(arrFlight.getFlightCode());
//                                arrFlightDTO.setAirline(airlineDTOMapper.convertEntityToDto(arrFlight.getAirline()));
//                                arrFlightDTO.setDepartureTime(arrFlight.getDepartureTime());
//                                arrFlightDTO.setArrivalTime(arrFlight.getArrivalTime());
////                                arrFlightDTO.setDepartureAirport(airportDTOMapper.convertEntityToDto(arrFlight.getDepartureAirport()));
////                                arrFlightDTO.setArrivalAirport(airportDTOMapper.convertEntityToDto(arrFlight.getArrivalAirport()));
//
//                                return arrFlightDTO;
//                            }).collect(Collectors.toSet());
//                    airportDTO.setDepartureFlights(depFlightDTOSet);
//                    airportDTO.setArrivalFlights(arrFlightDTOSet);
//                    return airportDTO;
//                }).collect(Collectors.toList());
//        return airportDTOList;
//    }
public List<AirportDTO> readAllAirports() {
    List<Airport> airports = airportRepo.findAll();
    List<AirportDTO> airportDTOList = airports.stream()
            .map(airport -> {
                AirportDTO airportDTO = new AirportDTO();
                airportDTO.setName(airport.getName());

                Set<FlightDTO> departureFlights = airport.getDepartureFlights().stream()
                        .map(flight -> flightDTOMapper.convertFlightToDto(flight))
                        .collect(Collectors.toSet());
                airportDTO.setDepartureFlights(departureFlights);

                Set<FlightDTO> arrivalFlights = airport.getArrivalFlights().stream()
                        .map(flight -> flightDTOMapper.convertFlightToDto(flight))
                        .collect(Collectors.toSet());
                airportDTO.setArrivalFlights(arrivalFlights);

                return airportDTO;
            })
            .collect(Collectors.toList());
    return airportDTOList;
}

//    private FlightDTO convertFlightToDto(Flight flight) {
//        FlightDTO flightDTO = new FlightDTO();
//        flightDTO.setFlightCode(flight.getFlightCode());
//
//        AirportDTO departureAirportDTO = new AirportDTO();
//        departureAirportDTO.setName(flight.getDepartureAirport().getName());
//        flightDTO.setDepartureAirport(departureAirportDTO);
//
//        AirportDTO arrivalAirportDTO = new AirportDTO();
//        arrivalAirportDTO.setName(flight.getArrivalAirport().getName());
//        flightDTO.setArrivalAirport(arrivalAirportDTO);
//
//        flightDTO.setDepartureTime(flight.getDepartureTime());
//        flightDTO.setArrivalTime(flight.getArrivalTime());
//
//        flightDTO.setAirline(airlineDTOMapper.convertEntityToDto(flight.getAirline()));
//        return flightDTO;
//    }



}

