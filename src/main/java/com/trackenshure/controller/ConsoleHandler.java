package com.trackenshure.controller;

import com.trackenshure.dao.BetDao;
import com.trackenshure.dao.HumanDao;
import com.trackenshure.factory.BetDaoFactory;
import com.trackenshure.lib.Inject;
import com.trackenshure.model.Bet;
import com.trackenshure.model.Car;
import com.trackenshure.model.Human;

import java.util.Collections;
import java.util.Optional;
import java.util.Scanner;

// Dependency injection

public class ConsoleHandler {

//    @Inject
//    private Car car;

//    @Inject
//    private HumanDao humanDao;

    @Inject
    private BetDao betDao;
    //private BetDao betDao = BetDaoFactory.getBetDao();


//    DbProperties dbProperties = new DbProperties("some value");
//    private BetDao betDao = new BetDaoJDBCImpl(dbProperties);
//    private BetDao betDao = new BetDaoImpl();

    public void handle() {
        try (Scanner sc = new Scanner(System.in)) {
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
                    System.out.println("Данные введены не корректно ");
                }

                betDao.add(bet);


                Optional<Bet> betFromDb = betDao.getBet(3);
                betFromDb.ifPresent(x -> {x.setRisk(0.3);
                    System.out.println(x);});

//                if (betFromDb.isPresent()) {
//                    Bet bet1 = betFromDb.get();
//                    bet1.setRisk(0.4);
//                }

//                if (betFromDb != null) {
//                    betFromDb.setRisk(0.4);
//                    Human human = betFromDb.getHuman();
//                    if (human!=null) {
//                        betFromDb.getHuman().getCar();
//                    }
//                }
//
//                betFromDb.getHuman().getCar();
//                betDao.getAll();
//                Collections.emptyList();


 //               System.out.println(betDao.getBet(3));
                System.out.println(bet == null ? null : bet.toString());
            }
        }
    }
}
