package com.airbook.flightsreservationproject.dto;

import com.airbook.flightsreservationproject.models.Booking;
import com.airbook.flightsreservationproject.models.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookingDTOMapper {

        public BookingDTO convertEntityToDto(Booking booking) {
        ModelMapper modelMapper = new ModelMapper();
        BookingDTO bookingDTO = modelMapper.map(booking, BookingDTO.class);
        return bookingDTO;
    }

    public Booking  convertDtoToEntity(BookingDTO bookingDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Booking booking = modelMapper.map(bookingDTO, Booking.class);
        return booking;
    }

}
