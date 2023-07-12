package com.airbook.flightsreservationproject.dto;

import com.airbook.flightsreservationproject.models.Flight;
import lombok.NoArgsConstructor;

import java.util.Set;
@NoArgsConstructor
public class AirportDTO {
    private Set<FlightDTO> departureFlights;
    private Set<FlightDTO> arrivalFlights;
    private  String name;

    public Set<FlightDTO> getDepartureFlights() {
        return departureFlights;
    }

    public void setDepartureFlights(Set<FlightDTO> departureFlights) {
        this.departureFlights = departureFlights;
    }

    public Set<FlightDTO> getArrivalFlights() {
        return arrivalFlights;
    }

    public void setArrivalFlights(Set<FlightDTO> arrivalFlights) {
        this.arrivalFlights = arrivalFlights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
