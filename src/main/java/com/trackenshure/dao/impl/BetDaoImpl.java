package com.trackenshure.dao.impl;

import com.trackenshure.dao.BetDao;
import com.trackenshure.db.Storage;
import com.trackenshure.lib.Dao;
import com.trackenshure.model.Bet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Наш класс для работы с Базой данных и таблицой ставок
//@Dao
public class BetDaoImpl implements BetDao {

    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }

    @Override
    public Optional<Bet> getBet(int indexBet) {
        if (indexBet >= Storage.bets.size() || indexBet < 0) {
            return Optional.empty();
        }
        return Optional.of(Storage.bets.get(indexBet));

//        try {
//            return Storage.bets.get(indexBet);
//        } catch (IndexOutOfBoundsException e) {
//            return null;
//        }
    }
}
 