package com.trackenshure.dao.impl;

import com.trackenshure.dao.BetDao;
import com.trackenshure.db.Storage;
import com.trackenshure.lib.Dao;
import com.trackenshure.model.Bet;

import java.util.ArrayList;
import java.util.List;

@Dao
public class BetDaoImpl implements BetDao {

    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }
}
