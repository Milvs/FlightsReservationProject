package com.airbook.flightsreservationproject.dto;

import com.airbook.flightsreservationproject.models.Flight;

import java.util.Set;

public class AirlineDTO {
    private Set<FlightDTO> flights;

    private String name;
    private String country;
    private String city;
    private  String airline_code;

    public Set<FlightDTO> getFlights() {
        return flights;
    }

    public void setFlights(Set<FlightDTO> flights) {
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAirline_code() {
        return airline_code;
    }

    public void setAirline_code(String airline_code) {
        this.airline_code = airline_code;
    }
}
