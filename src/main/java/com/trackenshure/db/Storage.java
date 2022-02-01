package com.trackenshure.db;

import com.trackenshure.model.Bet;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Storage {
    public static final List<Bet> bets = new ArrayList<>();
}
