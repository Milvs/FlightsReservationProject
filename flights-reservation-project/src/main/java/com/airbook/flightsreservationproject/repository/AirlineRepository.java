package com.airbook.flightsreservationproject.repository;

import com.airbook.flightsreservationproject.models.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {

}
