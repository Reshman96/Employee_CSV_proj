package employee_csv_proj.controller;

import employee_csv_proj.config.Config;
import employee_csv_proj.controller.Database_management.EmployeeDAO;
import employee_csv_proj.controller.logging.CSVLogManager;
import employee_csv_proj.model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

//Change line 19 to add the employee to your collection eg. repository.add(new employee(employeeData))
public class EmployeeCSVParser {

    public static void createEmployeeData() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Config.employeeCSVFileLocation()));
            bufferedReader.readLine();
            for(String employeeRecord = bufferedReader.readLine(); employeeRecord != null; employeeRecord = bufferedReader.readLine()) {
                String[] employeeData = employeeRecord.split(",");
                Employee employee = new Employee(employeeData);
                EmployeeHashMap.addEmployee(employee.getEmpId(), employee);
                CSVLogManager.getInstance().logMessage(Level.INFO, "Added " + employee.getFirstName() + " " + employee.getLastName() + " to collection.");
            }
        } catch (IOException e) {
            CSVLogManager.getInstance().logMessage(Level.WARNING, "Couldn't read data from CSV file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        EmployeeHashMap employeeHashMap = new EmployeeHashMap();
        createEmployeeData();
        employeeDAO.addEmployees(EmployeeHashMap.getHashMapValues());
    }
}
