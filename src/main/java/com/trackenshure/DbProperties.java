package com.trackenshure;

public class DbProperties {

    private static final String URL = "jdbc:mysql://localhost:3306/bets";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "Epic49$$";

    private String someProp;

    public DbProperties(String someProp) {
        this.someProp = someProp;
    }
}
