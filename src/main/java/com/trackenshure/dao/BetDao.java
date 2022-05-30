package com.trackenshure.dao;

import com.trackenshure.model.Bet;

import java.util.List;
import java.util.Optional;

public interface BetDao {
    void add(Bet bet);
    List<Bet> getAll();
    Optional<Bet> getBet(int index);
}
