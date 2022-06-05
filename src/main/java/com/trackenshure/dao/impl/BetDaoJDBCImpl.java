package com.trackenshure.dao.impl;

import com.trackenshure.dao.BetDao;
import com.trackenshure.DbProperties;
import com.trackenshure.lib.Dao;
import com.trackenshure.model.Bet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
НАШ КЛАСС ДЛЯ РАБТЫ С БАЗОЙ ДАННЫХ И ТАБЛИЦЕЙ СТАВОК
 */
@Dao
public class BetDaoJDBCImpl implements BetDao {

//    private DbProperties dbProperties;
//    public BetDaoJDBCImpl(DbProperties dbProperties) {
//        this.dbProperties = dbProperties;
//    }


    private static final String URL = "jdbc:mysql://localhost:3306/bets";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "Epic49$$";

    private static final String INSERT_BET = "INSERT INTO bets(value, risk) VALUES (?,?)";


    @Override
    public void add(Bet bet) {
        registerDriver();

        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(INSERT_BET)) {

            statement.setInt(1, bet.getValue());
            statement.setDouble(2, bet.getRisk());
            statement.execute();

            System.out.println("ставка " + bet + " успешно додана в БД");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Bet> getAll() {
        registerDriver();
        List<Bet> bets = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
             PreparedStatement ps = connection.prepareStatement("select * from bets")) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bet bet = new Bet();
                int betId = rs.getInt(1);
                int value = rs.getInt(2);
                Double risk = rs.getDouble(3);
                bet.setId(betId);
                bet.setValue(value);
                bet.setRisk(risk);
                bets.add(bet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bets;
    }

    @Override
    public Optional<Bet> getBet(int index) {
        return null;
    }

    private static void registerDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
