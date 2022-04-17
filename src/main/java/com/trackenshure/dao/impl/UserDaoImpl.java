package com.trackenshure.dao.impl;

import com.trackenshure.dao.UserDao;
import com.trackenshure.model.User;
import com.trackenshure.util.DbConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Sergey Klunniy
 */
public class UserDaoImpl implements UserDao {

    private List<User> userList = new ArrayList<>();


    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DbConnector.connect()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()) {
                User userFromDb = new User(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4)
                );

                users.add(userFromDb);

//                User userFromDb2 = new User(
//                        resultSet.getInt("id"),
//                        resultSet.getString("email"),
//                        resultSet.getString("password"),
//                        resultSet.getString("role")
//                );
            }
        } catch (SQLException e) {
            e.printStackTrace();   // logging
        }
        return users;
    }

    @Override
    public void add(User user) {
        try (Connection connection = DbConnector.connect()) {
//            String sql = String.format("insert into carsshop.users(email, password, role) values (%1$s, %2$s, %3$s", user.getEmail(), user.getPassword(), user.getRole());
            String sql = String.format("insert into users(email, password, role) " +
                    "values('%s', '%s', '%s')", user.getEmail(), user.getPassword(), user.getRole());
            Statement statement = Objects.requireNonNull(connection).createStatement();
            statement.execute(sql);

            System.out.println(sql);
        } catch (SQLException e) {
            e.printStackTrace();   // logging
        }
        userList.add(user);
    }

    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.add(new User("test@gmail.com", "123", "admin"));

//        List<User> all = userDao.getAll();
//        //all.forEach(System.out::println(););
//        System.out.println(all);
    }
}
