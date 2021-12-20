package employee_csv_proj.controller.Database_management.SQL_Queries;

public interface EmployeesSQL {
    String ADD_EMPLOYEE = "INSERT INTO employees (`employeeID`, `name_prefix`, `first_name`, `middle_initial`, `last_name`, `gender`, `email`, `date_of_birth`, `date_of_joining`, `salary`) VALUES (?,?,?,?,?,?,?,?,?,?)";
    String GET_ALL_EMPLOYEES = "SELECT * FROM employees";
}
