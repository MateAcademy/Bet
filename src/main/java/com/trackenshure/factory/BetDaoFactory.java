package com.trackenshure.factory;

import com.trackenshure.dao.BetDao;
import com.trackenshure.dao.HumanDao;
import com.trackenshure.dao.impl.BetDaoImpl;
import com.trackenshure.dao.impl.HumanDaoImpl;

/**
 * @author Sergey Klunniy
 */
public class BetDaoFactory {
    private static BetDao betDao;
    private static HumanDao humanDao;

    public static Object getObject(Class o) {
        String nameClazz = o.getSimpleName();

        if (nameClazz.startsWith("BetDao"))
            return getBetDao();

        if (nameClazz.startsWith("HumanDao"))
            return getHumanDao();

        return null;
    }

    private static BetDao getBetDao() {
        if (betDao == null) {
            betDao = new BetDaoImpl();
        }
        return betDao;
    }

    private static HumanDao getHumanDao() {
        if (humanDao == null) {
            humanDao = new HumanDaoImpl();
        }
        return humanDao;
    }
}
