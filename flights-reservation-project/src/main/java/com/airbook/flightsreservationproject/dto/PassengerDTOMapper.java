package com.airbook.flightsreservationproject.dto;


import com.airbook.flightsreservationproject.models.Passenger;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PassengerDTOMapper {
    public PassengerDTO convertEntityToDto(Passenger passenger) {
        ModelMapper modelMapper = new ModelMapper();
        PassengerDTO passengerDTO = modelMapper.map(passenger,PassengerDTO.class);
        return passengerDTO;
    }

    public Passenger convertDtoToEntity(PassengerDTO passengerDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Passenger passenger = modelMapper.map(passengerDTO, Passenger.class);
        return passenger;
    }
}
