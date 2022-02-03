package com.trackenshure.dao.impl;

import com.trackenshure.dao.BetDao;
import com.trackenshure.DbProperties;
import com.trackenshure.model.Bet;

import java.util.List;

public class BetDaoJDBCImpl implements BetDao {

    private DbProperties dbProperties;

    public BetDaoJDBCImpl(DbProperties dbProperties) {
        this.dbProperties = dbProperties;
    }

    @Override
    public void add(Bet bet) {
        //jdbc impl
    }

    @Override
    public List<Bet> getAll() {
        return null;
    }
}
