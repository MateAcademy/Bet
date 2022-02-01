package com.trackenshure.dao.impl;

import com.trackenshure.dao.BetDao;
import com.trackenshure.db.Storage;
import com.trackenshure.model.Bet;

import java.util.ArrayList;
import java.util.List;

public class BetDaoImpl implements BetDao {

    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
//        List<Bet> bets = new ArrayList<>();
//        int c = Storage.bets.size();
//        for (int i = 0; i < Storage.bets.size(); i++) {
//            bets.add(Storage.bets.get(i));
//        }
//        return bets;
        return Storage.bets;
    }
}
