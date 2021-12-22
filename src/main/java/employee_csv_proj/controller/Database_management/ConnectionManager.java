package employee_csv_proj.controller.Database_management;

import employee_csv_proj.config.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class which is responsible for establishing the connections needed to access the MySQL database.
 */
public class ConnectionManager {

    /**
     * Initialises the connection to the MySQL database.
     * @return Gives back the connection needed to database.
     */
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

    /**
     * Initialises the connection to the MySQL database employees table.
     * @return Gives back the connection needed to employee table in the database.
     */
    public static Connection dbEmployeeConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(Config.dbConnectionURL() + "/" + Config.dbNameURL(), Config.dbUsernameURL(), Config.dbPasswordURL());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * Given a connection previously established, the method will close the connection.
     * @param connection Needs a currently active connection.
     */
    public static void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}