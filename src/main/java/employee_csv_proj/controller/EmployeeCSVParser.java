package employee_csv_proj.controller;

import employee_csv_proj.config.Config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeCSVParser {

    public static void createEmployeeData() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Config.employeeCSVFileLocation()));
            bufferedReader.readLine();
            for(String employeeRecord = bufferedReader.readLine(); employeeRecord != null; employeeRecord = bufferedReader.readLine()) {
                System.out.println(employeeRecord);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createEmployeeData();
    }
}
