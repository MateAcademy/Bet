package com.trackenshure.factory;

import com.trackenshure.dao.BetDao;
import com.trackenshure.dao.HumanDao;
import com.trackenshure.dao.impl.BetDaoImpl;
import com.trackenshure.dao.impl.HumanDaoImpl;

/**
 * @author Sergey Klunniy
 */
public class Factory {
    private static BetDao betDao;
    private static HumanDao humanDao;

    public static BetDao getBetDao() {
        if (betDao == null) {
            betDao = new BetDaoImpl();
        }
        return betDao;
    }

    public static HumanDao getHumanDao() {
        if (humanDao == null) {
            humanDao = new HumanDaoImpl();
        }
        return humanDao;
    }
}
