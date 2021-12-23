package employee_csv_proj.controller.Database_management;

import employee_csv_proj.config.Config;
import employee_csv_proj.controller.logging.CSVLogManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

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
        CSVLogManager.getInstance().setupLog("src/main/java/employee_csv_proj/controller/logging/ConnectionManager.log");
         try {
             connection = DriverManager.getConnection(Config.dbConnectionURL(), Config.dbUsernameURL(), Config.dbPasswordURL());
             CSVLogManager.getInstance().logMessage(Level.INFO, "Connected to database!");
         } catch (SQLException e) {
             CSVLogManager.getInstance().logMessage(Level.WARNING, "Problem connecting to the database");
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
        CSVLogManager.getInstance().setupLog("src/main/java/employee_csv_proj/controller/logging/ConnectionManager.log");
        try {
            connection = DriverManager.getConnection(Config.dbConnectionURL() + "/" + Config.dbNameURL(), Config.dbUsernameURL(), Config.dbPasswordURL());
            CSVLogManager.getInstance().logMessage(Level.INFO, "Connection to MySQL database initialised!");
        } catch (SQLException e) {
            CSVLogManager.getInstance().logMessage(Level.WARNING, "Problem initialising connection to MySQL database");
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * Given a connection previously established, the method will close the connection.
     * @param connection Needs a currently active connection.
     */
    public static void closeConnection(Connection connection){
        CSVLogManager.getInstance().setupLog("src/main/java/employee_csv_proj/controller/logging/ConnectionManager.log");
        try {
            connection.close();
            CSVLogManager.getInstance().logMessage(Level.INFO, "Connection to closed");
        } catch (SQLException e) {
            CSVLogManager.getInstance().logMessage(Level.WARNING, "Error occurred when closing connection");
            e.printStackTrace();
        }
    }
}