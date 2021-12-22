package employee_csv_proj.controller.Database_management;

import employee_csv_proj.controller.Database_management.SQL_Queries.EmployeesSQL;
import employee_csv_proj.controller.EmployeeHashMap;
import employee_csv_proj.model.Employee;

import java.sql.*;
import java.util.Collection;
import java.util.HashSet;

/**
 * A class which is responsible for accessing the MySQL database, by sending and retrieving the employee data.
 */
public class EmployeeDAO {

    /**
     * Sends all the information from an individual employee to the MySQL database using the get methods from @{@link Employee}.
     * @param employee Employee class that contains all the values needed to input onto the database.
     */
    public void addEmployee(Employee employee){
        try {
            PreparedStatement employeePreparedStatement = ConnectionManager.dbEmployeeConnection().prepareStatement(EmployeesSQL.ADD_EMPLOYEE);
            employeePreparedStatement.setInt(1,employee.getEmpId());
            employeePreparedStatement.setString(2,employee.getNamePrefix());
            employeePreparedStatement.setString(3,employee.getFirstName());
            employeePreparedStatement.setString(4,employee.getMiddleInitial());
            employeePreparedStatement.setString(5,employee.getLastName());
            employeePreparedStatement.setString(6,employee.getGender());
            employeePreparedStatement.setString(7,employee.getEmail());
            employeePreparedStatement.setDate(8, Date.valueOf(employee.getDob()));
            employeePreparedStatement.setDate(9,Date.valueOf(employee.getDateOfJoining()));
            employeePreparedStatement.setInt(10,employee.getSalary());
            employeePreparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loops through the Employee HashMap and calls the addEmployee method for each employee present.
     * @param EmployeeList Requires the Employee Hashmap where all the employee classes are stored.
     */
    public void addEmployees(Collection<Employee> EmployeeList){
        for (Employee employee: EmployeeList){
            addEmployee(employee);
        }
    }

    /**
     * Returns all the employees from the MySQL database using the GET_ALL_EMPLOYEES query from @{@link EmployeesSQL}.
     */
    public void getAllEmployees(){
        try {
            ResultSet resultSet = ConnectionManager.dbEmployeeConnection().createStatement().executeQuery(EmployeesSQL.GET_ALL_EMPLOYEES);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) +
                          " " + resultSet.getString(2) +
                          " " + resultSet.getString(3) +
                          " " + resultSet.getString(4) +
                          " " + resultSet.getString(5) +
                          " " + resultSet.getString(6) +
                          " " + resultSet.getString(7) +
                          " " + resultSet.getString(8) +
                          " " + resultSet.getString(9) +
                          " " + resultSet.getString(10));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//How it works

//    public static void main(String[] args) {
//        EmployeeDAO employeeDAO = new EmployeeDAO();
//        EmployeeHashMap employeeHashMap = new EmployeeHashMap();
//        Employee employee = new Employee(new String[]{"5", "Mrs", "Jane", "m", "Doe", "F", "fjksfnsdf@hotmail.com", "9/21/1982", "9/21/1982", "45645"});
//        employeeHashMap.addEmployee(employee.getEmpId(),employee);
//
//        employeeDAO.addEmployees(employeeHashMap.getHashMapValues());
//
//
//    }

}