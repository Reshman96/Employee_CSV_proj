package model;

import employee_csv_proj.model.Employee;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

public class EmployeeTests {

    private Employee employee;

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        //Used for setting up databases
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @BeforeEach
    void setup(TestInfo testInfo){
        employee = new Employee(new String[]{"100000", "Mr", "Tony", "W", "Parsons", "M", "TParsons@spartaglobal.com", "11/27/1994", "12/2/2021", "19000"});
        System.out.println(testInfo.getDisplayName());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Employee ID is 1000000")
    void employeeIDIs100000() {
        Assumptions.assumeTrue(employee.getEmpId() != 0); //Assumptions == Pre-Test. Doesn't break code
        Assertions.assertEquals(100000, employee.getEmpId());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Employee is Mr")
    void employeeIsMr() {
        Assumptions.assumeTrue(employee.getNamePrefix() != null);
        Assertions.assertEquals("Mr", employee.getNamePrefix());
    }


    @Tag("MyTests")
    @Test
    @DisplayName("Employee is called Tony")
    void employeeIsCalledTony() {
        Assumptions.assumeTrue(employee.getFirstName() != null);
        Assertions.assertEquals("Tony", employee.getFirstName());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Employee's Middle Initial Is W")
    void employeesMiddleInitialIsW() {
        Assumptions.assumeTrue(employee.getMiddleInitial() != null);
        Assertions.assertEquals("W", employee.getMiddleInitial());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Employee's Surname Is Parsons")
    void employeesSurnameIsParsons() {
        Assumptions.assumeTrue(employee.getLastName() != null);
        Assertions.assertEquals("Parsons", employee.getLastName());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Employees Gender Is M")
    void employeesGenderIsM() {
        Assumptions.assumeTrue(employee.getGender() != null);
        Assertions.assertEquals("M", employee.getGender());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Employees Email Is TParsons@spartaglobal.com")
    void employeeHasEmail() {
        Assumptions.assumeTrue(employee.getEmail() != null);
        Assertions.assertEquals("TParsons@spartaglobal.com", employee.getEmail());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Employees DOB Is 11/27/1994")
    void employeeHasDOB() {
        LocalDate localDate = LocalDate.parse("11/27/1994", DateTimeFormatter.ofPattern("M[M]/d[d]/yyyy"));
        Assumptions.assumeTrue(employee.getDob() != null);
        Assertions.assertEquals(localDate, employee.getDob());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Employees Join Date Is 12/2/2021")
    void employeeHasJoinDate() {
        LocalDate localDate = LocalDate.parse("12/02/2021",DateTimeFormatter.ofPattern("M[M]/d[d]/yyyy"));
        Assumptions.assumeTrue(employee.getDateOfJoining() != null);
        Assertions.assertEquals(localDate, employee.getDateOfJoining());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Employees Salary Is 19000")
    void employeesSalaryIs19000() {
        Assumptions.assumeTrue(employee.getSalary() != 0);
        Assertions.assertEquals(19000, employee.getSalary());
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " has finished testing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo){
        System.out.println(testInfo.getTestClass() + " completed");
    }

}
