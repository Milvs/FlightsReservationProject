package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.dto.BookingDTO;
import com.airbook.flightsreservationproject.dto.PassengerDTO;
import com.airbook.flightsreservationproject.dto.PassengerDTOMapper;
import com.airbook.flightsreservationproject.models.Passenger;
import com.airbook.flightsreservationproject.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PassengerService {
    @Autowired
    public PassengerRepo passengerRepo;
    @Autowired
    public PassengerDTOMapper passengerDTOMapper;


    public void deletePassengerById(long id){
        passengerRepo.delete(id);

    }
    public PassengerDTO createPassenger(PassengerDTO passenger){
        Passenger createdPassenger = passengerDTOMapper.convertDtoToEntity(passenger);
        passengerRepo.create(createdPassenger);
        return passengerDTOMapper.convertEntityToDto(createdPassenger);
    }

    public List<PassengerDTO> readAllPassengers(){

        List< Passenger> passengers = passengerRepo.findAll();
        List<PassengerDTO> passengerDTOList = passengers.stream()
                .map(passenger -> {
                    PassengerDTO passengerDTO = new PassengerDTO();
                    passengerDTO.setName(passenger.getName());
                    Set<BookingDTO> bookingDTOSet = passenger.getBookings().stream()
                            .map(booking ->{
                                BookingDTO bookingDTO = new BookingDTO();
                                bookingDTO.setAmount(booking.getAmount());
                                bookingDTO.setPaymentDate(booking.getPaymentDate());
                                return bookingDTO;
                            }).collect(Collectors.toSet());
                    passengerDTO.setBookings(bookingDTOSet);
                    return passengerDTO;
                }).collect(Collectors.toList());
        return passengerDTOList;
    }
}
