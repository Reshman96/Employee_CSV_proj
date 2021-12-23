package employee_csv_proj.controller.start;

import employee_csv_proj.controller.DataCleaner;
import employee_csv_proj.controller.Database_management.DatabaseInitialiser;
import employee_csv_proj.controller.Database_management.EmployeeDAO;
import employee_csv_proj.controller.EmployeeHashMap;
import employee_csv_proj.controller.display.DisplayManager;
import employee_csv_proj.model.Employee;

import java.util.Scanner;

public class QueryLoader {

    public static void start() {

        DatabaseInitialiser.initialiseDbFirstInstance();
        Scanner scanner = new Scanner(System.in);
        new EmployeeHashMap();
        boolean wantReplay = true;

        while(wantReplay) {
            wantReplay = false;
            DisplayManager.requestCommand();
            int commandNumber = scanner.nextInt();
            scanner.nextLine();

            switch (commandNumber) {
                case 1:
                    // user wants to add a new employee

                    DisplayManager.requestEmployeeID();
                    int employeeID = scanner.nextInt();
                    scanner.nextLine();
                    DisplayManager.requestHonoraryTitle();
                    String honoraryTitle = scanner.nextLine();
                    DisplayManager.requestFirstName();
                    String firstName = scanner.nextLine();
                    DisplayManager.requestMiddleNameInitial();
                    String middleNameInitial = scanner.nextLine();
                    DisplayManager.requestLastName();
                    String lastName = scanner.nextLine();
                    DisplayManager.requestGender();
                    String gender = scanner.nextLine();
                    DisplayManager.requestEmail();
                    String email = scanner.nextLine();
                    DisplayManager.requestDateOfBirth();
                    String dateOfBirth = scanner.nextLine();
                    DisplayManager.requestDateOfJoining();
                    String dateOfJoining = scanner.nextLine();
                    DisplayManager.requestSalary();
                    int salary = scanner.nextInt();
                    scanner.nextLine();

                    EmployeeDAO employeeDAO = new EmployeeDAO();
                    String employeeIDString = Integer.toString(employeeID);
                    String salaryString = Integer.toString(salary);
                    String[] str = new String[]{employeeIDString, honoraryTitle, firstName, middleNameInitial, lastName, gender, email, dateOfBirth, dateOfJoining, salaryString};
                    Employee employee = new Employee(str);
//                EmployeeHashMap.addEmployee(employee.getEmpId(), employee);
                    if (DataCleaner.checkData(EmployeeHashMap.getHashMap(), employee)) {
                        employeeDAO.addEmployees(EmployeeHashMap.getHashMapValues());
                    } else {
                        System.out.println("Did not add");
                    }
                    break;
                case 2:
                    // user wants to retrieve data about an existing employee

                    System.out.println("Enter Employee ID or name: ");
                    String idOrName = scanner.nextLine();
                    boolean isId = true;
                    for (char letterOrNum : idOrName.toCharArray()) {
                        if (letterOrNum > 64 && letterOrNum < 91) {
                            isId = false;
                        }
                        if (letterOrNum > 96 && letterOrNum < 123) {
                            isId = false;
                        }
                    }
                    if (isId) {
                        System.out.println("Retrieving information about Employee ID No." + idOrName + ":");
                        System.out.println("ID: " + idOrName + ", Name: James Potter, Gender: M, Salary: 65873");
                    } else {
                        System.out.println("Retrieving information about " + idOrName + ":");
                        System.out.println("ID: 453462, Name: " + idOrName + ", Gender: M, Salary: 134764");
                    }
                    break;
            }

            // Asks the user if they'd like to perform another sort. If yes, replays the app, otherwise terminates
            DisplayManager.displayStartOver();
            String wantToReset = scanner.nextLine();
            if (wantToReset.toLowerCase().contains("yes")) {
                wantReplay = true;
            }
        }
    }
}
