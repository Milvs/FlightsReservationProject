package com.airbook.flightsreservationproject.service;

import com.airbook.flightsreservationproject.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    public CategoryRepo categoryRepo;

}
