package com.trackenshure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CinemaHall {

    @Id
    private long id;
    private int capacity;
    private String description;

    public CinemaHall(int capacity, String description) {
        this.capacity = capacity;
        this.description = description;
    }
}
