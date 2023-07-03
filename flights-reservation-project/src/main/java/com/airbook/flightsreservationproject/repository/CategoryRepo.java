package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Category;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepo extends BaseRepo<Category>{
    @Override
    public String getEntityName() {
        return Category.class.getSimpleName();
    }
}
