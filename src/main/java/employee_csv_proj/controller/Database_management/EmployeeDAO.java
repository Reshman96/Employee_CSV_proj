package employee_csv_proj.controller.Database_management;

import employee_csv_proj.controller.Database_management.SQL_Queries.EmployeesSQL;
import employee_csv_proj.model.Employee;

import java.sql.*;

public class EmployeeDAO {

//    Employee janeDoe = new Employee(1,"Jane", "Doe");
//    Employee ohnDoe = new Employee(2,"John", "Doe");

    public static void addEmployeePreparedStatement(int employeeId, String namePrefix, String firstName, String middleInitial, String lastName, String gender, String email, Date dateOfBirth, Date dateOfJoining, int salary){
        try {
            PreparedStatement employeePreparedStatement = ConnectionManager.dbEmployeeConnection().prepareStatement(EmployeesSQL.ADD_EMPLOYEE);
            employeePreparedStatement.setInt(1,employeeId);
            employeePreparedStatement.setString(2,namePrefix);
            employeePreparedStatement.setString(3,firstName);
            employeePreparedStatement.setString(4,middleInitial);
            employeePreparedStatement.setString(5,lastName);
            employeePreparedStatement.setString(6,gender);
            employeePreparedStatement.setString(7,email);
            employeePreparedStatement.setDate(8,dateOfBirth);
            employeePreparedStatement.setDate(9,dateOfJoining);
            employeePreparedStatement.setInt(10,salary);

            employeePreparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getAllEmployees(){
        try {
            ResultSet resultSet = ConnectionManager.dbEmployeeConnection().createStatement().executeQuery(EmployeesSQL.GET_ALL_EMPLOYEES);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
                System.out.println(resultSet.getString(5));
                System.out.println(resultSet.getString(6));
                System.out.println(resultSet.getString(7));
                System.out.println(resultSet.getDate(8));
                System.out.println(resultSet.getDate(9));
                System.out.println(resultSet.getInt(10));
                System.out.println(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        EmployeeDAO.addEmployeePureSql(1, "Jane", "Doe");

          EmployeeDAO.addEmployeePreparedStatement(1, "Mrs", "Jane", "m", "Doe", "F", "fjksfnsdf@hotmail.com", null, null, 45645);
//        EmployeeDAO.getAllEmployees();
    }
}