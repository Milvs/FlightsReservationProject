package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data @NoArgsConstructor
@Table(name = "passengers")
public class Passenger extends BaseEntity{

    private String name;
    private String passportNumber;

    @OneToOne(mappedBy = "passenger", cascade = CascadeType.ALL)//non-owning side
    private Ticket tickets;
//
//    @OneToMany(mappedBy = "passenger")
//    private Set<Booking> bookings;
//

}
// parent е класа който има референциа към child класа