package com.airbook.flightsreservationproject.controllers;

import com.airbook.flightsreservationproject.dto.CustomerDTO;
import com.airbook.flightsreservationproject.dto.CustomerDTOMapper;
import com.airbook.flightsreservationproject.models.Customer;
import com.airbook.flightsreservationproject.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/air")
public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public void createCustomer(@RequestBody CustomerDTO customer) {
        customerService.createCustomer(customer);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<CustomerDTO> readAllCustomers() {
        return customerService.readAllCustomers();
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
    public void deleteCustomerById(@PathVariable long id) {
        customerService.deleteCustomerById(id);
    }
}
