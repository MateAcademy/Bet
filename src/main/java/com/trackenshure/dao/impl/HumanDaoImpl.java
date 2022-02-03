package com.trackenshure.dao.impl;

import com.trackenshure.dao.HumanDao;
import com.trackenshure.db.Storage;
import com.trackenshure.lib.Dao;
import com.trackenshure.model.Human;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
@Dao
public class HumanDaoImpl implements HumanDao {
    @Override
    public void add(Human human) {
        Storage.humans.add(human);
    }

    @Override
    public List<Human> getAll() {
        return Storage.humans;
    }
}
