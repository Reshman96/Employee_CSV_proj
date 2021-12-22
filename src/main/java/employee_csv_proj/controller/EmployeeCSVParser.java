package employee_csv_proj.controller;

import employee_csv_proj.config.Config;
import employee_csv_proj.model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Change line 19 to add the employee to your collection eg. repository.add(new employee(employeeData))
public class EmployeeCSVParser {

    public static void createEmployeeData() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Config.employeeCSVFileLocation()));
            bufferedReader.readLine();
            for(String employeeRecord = bufferedReader.readLine(); employeeRecord != null; employeeRecord = bufferedReader.readLine()) {
                String[] employeeData = employeeRecord.split(",");
                Employee employee = new Employee(employeeData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createEmployeeData();
    }
}
