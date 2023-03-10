package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    private static UserService us = new UserServiceImpl();
    public static void main(String[] args) throws SQLException {
        us.createUsersTable();
        us.saveUser("Сергей", "Савицкий", (byte) 21);
        us.saveUser("Иван", "Сергеев", (byte) 45);
        us.saveUser("Владимир", "Ульянов", (byte) 45);
        us.saveUser("Владислав", "Моисеев", (byte) 45);
        us.getAllUsers();
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}
