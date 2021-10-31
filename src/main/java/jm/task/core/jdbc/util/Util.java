package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/kata_study";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1fIwerearichman";

    public static Connection setConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
            System.out.println("Не удалось подключиться к БД");
        }
        return connection;
    }
}

