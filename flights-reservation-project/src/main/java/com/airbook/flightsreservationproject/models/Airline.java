package com.airbook.flightsreservationproject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity

@NoArgsConstructor
@Table(name = "airlines")
public class Airline extends BaseEntity{

    @JsonIgnore
    @OneToMany(mappedBy = "airline", cascade = CascadeType.ALL)
    private Set<Flight> flights;

    private String name;
    private String country;
    private String city;
    private  String airline_code;

    public Airline(String name, String country, String city, String airline_code) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.airline_code = airline_code;
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

    @Override
    public String toString() {
        return "Airline{" +
                "flights=" + flights +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", airline_code='" + airline_code + '\'' +
                '}';}
}
