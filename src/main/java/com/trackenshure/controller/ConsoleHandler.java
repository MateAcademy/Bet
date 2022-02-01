package com.trackenshure.controller;

import com.trackenshure.dao.BetDao;
import com.trackenshure.dao.DbProperties;
import com.trackenshure.dao.impl.BetDaoImpl;
import com.trackenshure.dao.impl.BetDaoJDBCImpl;
import com.trackenshure.db.Storage;
import com.trackenshure.lib.Inject;
import com.trackenshure.model.Bet;

import java.util.Objects;
import java.util.Scanner;

// Dependency injection

public class ConsoleHandler {

    @Inject
    private BetDao betDao;
//    DbProperties dbProperties = new DbProperties("some value");
//    private BetDao betDao = new BetDaoJDBCImpl(dbProperties);
//    private BetDao betDao = new BetDaoImpl();

    public void handle() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String command = sc.nextLine();
            if (command.equals("q")) {
                return;
            }

            Bet bet = null;
            try {
                String[] betData = command.split(" ");
                int value = Integer.parseInt(betData[0]);
                double risk = Double.parseDouble(betData[1]);
                bet = new Bet(value, risk);

            } catch (NumberFormatException e) {
                System.out.println("будь - ласка, введіть корректні данні " + e);
            }

            betDao.add(bet);
            System.out.println(bet == null ? null : bet.toString());
        }

    }
}
