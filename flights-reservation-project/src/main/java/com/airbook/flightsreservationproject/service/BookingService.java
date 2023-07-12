package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.dto.BookingDTO;
import com.airbook.flightsreservationproject.dto.BookingDTOMapper;
import com.airbook.flightsreservationproject.dto.CustomerDTO;
import com.airbook.flightsreservationproject.models.Airport;
import com.airbook.flightsreservationproject.models.Booking;
import com.airbook.flightsreservationproject.models.Customer;
import com.airbook.flightsreservationproject.models.Flight;
import com.airbook.flightsreservationproject.repository.BookingRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {

    @Autowired
    public BookingRepo bookingRepo;
    @Autowired
    public BookingDTOMapper bookingDTOMapper;
    @Autowired
    public ModelMapper modelMapper;

    public void deleteBookingById(long id){
        bookingRepo.delete(id);

    }
    public BookingDTO createBooking(BookingDTO booking){
        Booking createdBooking = bookingDTOMapper.convertDtoToEntity(booking);
        bookingRepo.create(createdBooking);
        return bookingDTOMapper.convertEntityToDto(createdBooking);
    }
    public List<BookingDTO> readAllBookings(){
        List<Booking> bookings = bookingRepo.findAll();
        return bookings.stream().map(element -> modelMapper.map(element, BookingDTO.class))
                .collect(Collectors.toList());
    }
}
