package com.trackenshure.controller;

import com.trackenshure.dao.BetDao;
import com.trackenshure.dao.HumanDao;
import com.trackenshure.factory.BetDaoFactory;
import com.trackenshure.lib.Inject;
import com.trackenshure.model.Bet;

import java.util.Scanner;

// Dependency injection

public class  ConsoleHandler {

    @Inject
    private BetDao betDao;
    //private BetDao betDao = BetDaoFactory.getBetDao();
    @Inject
    private HumanDao humanDao;
//    DbProperties dbProperties = new DbProperties("some value");
//    private BetDao betDao = new BetDaoJDBCImpl(dbProperties);
//    private BetDao betDao = new BetDaoImpl();

    public void handle() {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Введіть value та risk для вашої ставки:");
            while (true) {
                String command = sc.nextLine();
                if (command.equals("q")) {
                    // System.exit(0);
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
}
