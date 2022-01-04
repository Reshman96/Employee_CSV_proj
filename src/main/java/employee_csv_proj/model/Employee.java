package employee_csv_proj.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    // data we gather about employee from employee CSV file
    private int empId;
    private String namePrefix;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender;
    private String email;
    private LocalDate dob;
    private LocalDate dateOfJoining;
    private int salary;

    public Employee(String[] employeeData) {
        this.setEmpId(Integer.parseInt(employeeData[0]));
        this.setNamePrefix(employeeData[1]);
        this.setFirstName(employeeData[2]);
        this.setMiddleInitial(employeeData[3]);
        this.setLastName(employeeData[4]);
        this.setGender(employeeData[5]);
        this.setEmail(employeeData[6]);
        this.setDob(employeeData[7]);
        this.setDateOfJoining(employeeData[8]);
        this.setSalary(Integer.parseInt(employeeData[9]));
    }

    public int getEmpId() {
        return empId;
    }

    private void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    private void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    private void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    private void setDob(String dob) {
        this.dob = LocalDate.parse(dob, DateTimeFormatter.ofPattern("M[M]/d[d]/yyyy"));
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    private void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = LocalDate.parse(dateOfJoining, DateTimeFormatter.ofPattern("M[M]/d[d]/yyyy"));
    }

    public int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }
}
