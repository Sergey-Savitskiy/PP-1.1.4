package jm.task.core.jdbc.util;
import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/database";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "0000";
    public static Connection getConnection() {

        Connection connect = null;
        try {
            connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
        }
        return connect;
    }

    // реализуйте настройку соеденения с БД
}
