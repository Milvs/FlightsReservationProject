package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Customer;
import org.springframework.stereotype.Repository;

@Repository

public class CustomerRepo extends BaseRepo<Customer>{
    @Override
    public String getEntityName() {
        return Customer.class.getSimpleName();
    }
}
