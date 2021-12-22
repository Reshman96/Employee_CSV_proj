package employee_csv_proj.controller.Database_management;

import employee_csv_proj.controller.Database_management.SQL_Queries.DbInitialStatements;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseInitialiser {

    private static void initialiseDb(){
        try {
            Connection connection = ConnectionManager.dbInitialiseConnection();
            connection.createStatement().executeUpdate(DbInitialStatements.DB_INITIALISE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void initialiseEmployeeTable(){
        try {
            Connection connection = ConnectionManager.dbEmployeeConnection();
            connection.createStatement().executeUpdate(DbInitialStatements.CREATE_EMPLOYEES_TABLE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initialiseDbFirstInstance(){
        DatabaseInitialiser.initialiseDb();
        DatabaseInitialiser.initialiseEmployeeTable();
    }

    public static void main(String[] args) {
        DatabaseInitialiser.initialiseDbFirstInstance();
    }
}
