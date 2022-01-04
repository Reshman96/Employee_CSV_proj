package employee_csv_proj.controller.Database_management;

import employee_csv_proj.controller.Database_management.SQL_Queries.DbInitialStatements;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * A Class which is responsible for creating the database in MySQL.
 */
public class DatabaseInitialiser {

    /**
     * Initialises the Employee_CSV_Database database if it doesn't exist already,
     * uses DB_INITIALISE from @{@link DbInitialStatements}.
     */
    private static void initialiseDb(){
        try {
            Connection connection = ConnectionManager.dbInitialiseConnection();
            connection.createStatement().executeUpdate(DbInitialStatements.DB_INITIALISE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Initialises the employees table in the Employee_CSV_Database database if it doesn't exist already,
     * uses CREATE_EMPLOYEES_TABLE from @{@link DbInitialStatements}.
     */
    private static void initialiseEmployeeTable(){
        try {
            Connection connection = ConnectionManager.dbEmployeeConnection();
            connection.createStatement().executeUpdate(DbInitialStatements.CREATE_EMPLOYEES_TABLE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method which combines both initialisations needed to create the database.
     */
    public static void initialiseDbFirstInstance(){
        DatabaseInitialiser.initialiseDb();
        DatabaseInitialiser.initialiseEmployeeTable();
    }

    public static void main(String[] args) {
        DatabaseInitialiser.initialiseDbFirstInstance();
    }
}
