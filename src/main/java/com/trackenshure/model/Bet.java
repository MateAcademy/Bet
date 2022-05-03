package com.trackenshure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bet {

    private int value;
    private Double risk;
    private Human human;

    public Bet(int value, Double risk) {
        this.value = value;
        this.risk = risk;
    }
}
