package employee_csv_proj.controller.start;

import employee_csv_proj.controller.Database_management.DatabaseInitialiser;
import employee_csv_proj.controller.Database_management.EmployeeDAO;
import employee_csv_proj.controller.EmployeeCSVParser;
import employee_csv_proj.controller.EmployeeHashMap;

public class App {

    public static void main(String[] args) {

//        DatabaseInitialiser.initialiseDbFirstInstance();
//        EmployeeDAO employeeDAO = new EmployeeDAO();
//        EmployeeCSVParser employeeCSVParser = new EmployeeCSVParser();
//        EmployeeHashMap employeeHashMap = new EmployeeHashMap();
//        employeeCSVParser.createEmployeeData();
//        employeeDAO.addEmployees(EmployeeHashMap.getHashMapValues());
//
//        employeeDAO.getAllEmployees();
        QueryLoader.start();

    }
}
