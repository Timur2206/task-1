package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
     static  String userName = "postgres";
     static  String password = "postgres";
     static String connectionUrl="jdbc:postgresql://localhost:5432/users";
    public static Connection open() {
        try {
            return DriverManager.getConnection(connectionUrl,userName,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // реализуйте настройку соеденения с БД
}
