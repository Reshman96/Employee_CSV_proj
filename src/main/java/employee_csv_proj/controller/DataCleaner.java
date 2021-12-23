package employee_csv_proj.controller;

import employee_csv_proj.controller.logging.CSVLogManager;
import employee_csv_proj.model.Employee;

import java.util.HashMap;
import java.util.logging.Level;

public class DataCleaner {

    public static boolean checkData(HashMap<Integer, Employee> hashMap, Employee employee) {
        CSVLogManager.getInstance().setupLog("src/main/java/employee_csv_proj/controller/logging/DataCleaner.log");
        for (Employee values : EmployeeHashMap.getHashMapValues()) {
            if (employee.getEmpId() == values.getEmpId()) {
                // deny employee data since ID already exists
                CSVLogManager.getInstance().logMessage(Level.WARNING, "Employee ID: " + employee.getEmpId() + " is not unique.");
                return false;
            }
        }
        // add employee data since ID is unique
        EmployeeHashMap.addEmployee(employee.getEmpId(), employee);
        CSVLogManager.getInstance().logMessage(Level.INFO, "Added " + employee.getFirstName() + " " + employee.getLastName() + " to collection.");
        return true;
    }
}
