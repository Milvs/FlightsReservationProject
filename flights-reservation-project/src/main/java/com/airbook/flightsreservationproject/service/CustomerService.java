package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.dto.BookingDTO;
import com.airbook.flightsreservationproject.dto.CustomerDTO;
import com.airbook.flightsreservationproject.dto.CustomerDTOMapper;
import com.airbook.flightsreservationproject.dto.MapList;
import com.airbook.flightsreservationproject.models.Customer;
import com.airbook.flightsreservationproject.repository.CustomerRepo;
import org.h2.engine.Mode;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepo customerRepo;
    @Autowired
    public CustomerDTOMapper customerDTOMapper;

    public void deleteCustomerById(long id) {
        customerRepo.delete(id);

    }

    public CustomerDTO createCustomer(CustomerDTO customer) {
        Customer createdCustomer = customerDTOMapper.convertDtoToEntity(customer);
        customerRepo.create(createdCustomer);
        return customerDTOMapper.convertEntityToDto(createdCustomer);
    }


    public List<CustomerDTO> readAllCustomers() {
        // maps to List in Postman
        List<Customer> customers = customerRepo.findAll();
        List<CustomerDTO> customerDTOList = customers.stream()
                .map(customer -> {
                    CustomerDTO customerDTO = new CustomerDTO();
                    customerDTO.setUsername(customer.getUsername());
                    customerDTO.setEmail(customer.getEmail());
                    Set<BookingDTO> bookingDTOSet = customer.getBookings().stream()
                            .map(booking ->{
                                BookingDTO bookingDTO = new BookingDTO();
                                bookingDTO.setAmount(booking.getAmount());
                                bookingDTO.setPaymentDate(booking.getPaymentDate());
                                return bookingDTO;
                            }).collect(Collectors.toSet());
                    customerDTO.setBookings(bookingDTOSet);
                    return customerDTO;
                }).collect(Collectors.toList());
            return customerDTOList;
        }




    }



