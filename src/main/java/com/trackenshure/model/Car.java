package com.trackenshure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sergey Klunniy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int id = 5;
    private String name = "bmw";
    private String color = "yellow";
}
