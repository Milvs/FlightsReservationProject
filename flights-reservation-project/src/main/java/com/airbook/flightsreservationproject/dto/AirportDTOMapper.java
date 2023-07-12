package com.airbook.flightsreservationproject.dto;

import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.models.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AirportDTOMapper {
    public AirportDTO convertEntityToDto(Airport airport) {
        ModelMapper modelMapper = new ModelMapper();
        AirportDTO airportDTO = modelMapper.map(airport,AirportDTO.class);
        return airportDTO;
    }

    public Airport convertDtoToEntity(AirportDTO airportDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Airport airport= modelMapper.map(airportDTO,Airport.class);
        return airport;
    }
}
