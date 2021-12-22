package employee_csv_proj.controller;

import employee_csv_proj.model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {
    private Integer employeeId;
    private Employee employee;
    private HashMap<Integer, Employee> employeeHashMap = new HashMap<>();

    public EmployeeHashMap(Integer employeeId, Employee employee) {
        this.employeeId = employeeId;
        this.employee = employee;
        this.employeeHashMap.put(employeeId, employee);
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
