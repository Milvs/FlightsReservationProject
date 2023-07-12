package com.airbook.flightsreservationproject.dto;

import com.airbook.flightsreservationproject.models.Airline;
import com.airbook.flightsreservationproject.models.Airport;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AirlineDTOMapper {
    public AirlineDTO convertEntityToDto(Airline airline) {
        ModelMapper modelMapper = new ModelMapper();
        AirlineDTO airlineDTO= modelMapper.map(airline,AirlineDTO.class);
        return airlineDTO;
    }

    public Airline convertDtoToEntity(AirlineDTO airlineDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Airline airline= modelMapper.map(airlineDTO,Airline.class);
        return airline;
    }
}
