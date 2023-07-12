package com.airbook.flightsreservationproject.dto;

import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.models.Flight;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlightDTOMapper {

    @Autowired
    private AirlineDTOMapper airlineDTOMapper;

    public FlightDTO convertEntityToDto(Flight flight) {
        ModelMapper modelMapper = new ModelMapper();
        FlightDTO flightDTO = modelMapper.map(flight, FlightDTO.class);
        return flightDTO;
    }

    public Flight convertDtoToEntity(FlightDTO flightDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Flight flight = modelMapper.map(flightDTO, Flight.class);
        return flight;
    }

    public FlightDTO convertFlightToDto(Flight flight) {

        FlightDTO flightDTO = new FlightDTO();
        flightDTO.setFlightCode(flight.getFlightCode());

        AirportDTO departureAirportDTO = new AirportDTO();
        departureAirportDTO.setName(flight.getDepartureAirport().getName());
        flightDTO.setDepartureAirport(departureAirportDTO);

        AirportDTO arrivalAirportDTO = new AirportDTO();
        arrivalAirportDTO.setName(flight.getArrivalAirport().getName());
        flightDTO.setArrivalAirport(arrivalAirportDTO);

        flightDTO.setDepartureTime(flight.getDepartureTime());
        flightDTO.setArrivalTime(flight.getArrivalTime());

        flightDTO.setAirline(airlineDTOMapper.convertEntityToDto(flight.getAirline()));
        return flightDTO;
    }
}
