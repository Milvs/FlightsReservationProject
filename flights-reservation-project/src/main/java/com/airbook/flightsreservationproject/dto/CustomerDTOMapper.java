package com.airbook.flightsreservationproject.dto;
import org.modelmapper.ModelMapper;


import com.airbook.flightsreservationproject.models.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDTOMapper {
    public CustomerDTO convertEntityToDto(Customer customer) {
        ModelMapper modelMapper = new ModelMapper();
        CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
        return customerDTO;
    }

    public Customer convertDtoToEntity(CustomerDTO customerDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        return customer;
    }



}
