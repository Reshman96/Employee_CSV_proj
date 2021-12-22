package employee_csv_proj.controller;

import employee_csv_proj.model.Employee;

import java.util.Collection;
import java.util.HashMap;

public class EmployeeHashMap {
    private static HashMap<Integer, Employee> employeeHashMap;

    public EmployeeHashMap() {
        employeeHashMap = new HashMap<>();
    }

    public static void addEmployee(int employeeId, Employee employee) {
        employeeHashMap.put(employeeId, employee);
    }

    public static Collection<Employee> getHashMapValues(){
        return employeeHashMap.values();
    }
}
