package com.airbook.flightsreservationproject.models;

import lombok.Data;


import javax.persistence.*;

@MappedSuperclass
@Data
public class BaseEntity {


    @Id
    @GeneratedValue
    private Long id;

//    public Long getId() {
//        return id;
//    }
}
