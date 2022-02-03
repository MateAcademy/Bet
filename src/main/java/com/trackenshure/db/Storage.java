package com.trackenshure.db;

import com.trackenshure.model.Bet;
import com.trackenshure.model.Human;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

// Это наша БД
@Data
public class Storage {
    public static final List<Bet> bets = new ArrayList<>();
    public static final List<Human> humans = new ArrayList<>();
}
