package employee_csv_proj.controller.Database_management;

import employee_csv_proj.config.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public static Connection dbInitialiseConnection(){
    Connection connection = null;

    try {
        connection = DriverManager.getConnection(Config.dbConnectionURL(), Config.dbUsernameURL(), Config.dbPasswordURL());
        System.out.println("Connected to db");
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return connection;
}

    public static Connection dbEmployeeConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(Config.dbConnectionURL() + "/" + Config.dbNameURL(), Config.dbUsernameURL(), Config.dbPasswordURL());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}