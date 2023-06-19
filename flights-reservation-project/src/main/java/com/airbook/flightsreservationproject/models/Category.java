package com.airbook.flightsreservationproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor
@Table(name = "categories")
public class Category extends BaseEntity {


    private String categoryValue;

    @ManyToOne
    @JoinColumn(name="seat_id")
    private Seat seat;

}
