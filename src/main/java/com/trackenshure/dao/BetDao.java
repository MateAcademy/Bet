package com.trackenshure.dao;

import com.trackenshure.model.Bet;

import java.util.List;

public interface BetDao {
    void add(Bet bet);
    List<Bet> getAll();
}
