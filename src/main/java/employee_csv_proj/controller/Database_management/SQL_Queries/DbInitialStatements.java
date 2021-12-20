package employee_csv_proj.controller.Database_management.SQL_Queries;

public interface DbInitialStatements {
    String DB_INITIALISE = "CREATE DATABASE IF NOT EXISTS Employee_CSV_Database";
    String CREATE_EMPLOYEES_TABLE = "CREATE TABLE IF NOT EXISTS employees(" +
            "employeeID INTEGER," +
            "name_prefix VARCHAR(7)," +
            "first_name VARCHAR(20)," +
            "middle_initial VARCHAR(1)," +
            "last_name VARCHAR(20)," +
            "gender VARCHAR(1)," +
            "email VARCHAR(50)," +
            "date_of_birth DATE," +
            "date_of_joining DATE," +
            "salary INTEGER)";
}
