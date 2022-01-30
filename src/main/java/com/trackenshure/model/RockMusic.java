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
public class RockMusic implements Music {
    private String name = "Wind cries Mary";

    @Override
    public String getSong() {
        return "RockMusic: " + name;
    }
}
