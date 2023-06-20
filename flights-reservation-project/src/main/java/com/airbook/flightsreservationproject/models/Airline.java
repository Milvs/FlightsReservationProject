package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Table(name = "airlines")
public class Airline extends BaseEntity{

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
}
