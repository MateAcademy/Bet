package com.trackenshure.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * @author Sergey Klunniy
 * Устанавливаем соединение с БД
 */
public class DbConnector {

    //private static final Logger logger = Logger.getLogger(DbConnector.class);

    private static String dbUrl = "jdbc:mysql://localhost:3306/carsshop?serverTimezone=UTC";
    private static String name = "root";
    private static String password = "Epic49$$";

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, name, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();  // logging logger.error("problem with connect to db", e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
