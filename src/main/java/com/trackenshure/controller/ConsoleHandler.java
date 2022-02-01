package com.trackenshure.controller;

import com.trackenshure.db.Storage;
import com.trackenshure.model.Bet;

import java.util.Scanner;

public class ConsoleHandler {

    public void handle() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String command = sc.nextLine();
                if (command.equals("q")) {
                    return;
                }
                String[] betData = command.split(" ");
                int value = Integer.parseInt(betData[0]);
                double risk = Double.parseDouble(betData[1]);
                Bet bet = new Bet(value, risk);
                Storage.bets.add(bet);
                System.out.println(bet.toString());
            } catch (Exception e) {
                System.out.println("будь ласка, введіть корректні данні");
            }
        }

    }
}
