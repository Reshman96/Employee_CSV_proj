package employee_csv_proj.controller.display;

public class DisplayManager {

    public static void requestCommand() {
        System.out.println("Please select what you would like to do: ");
        System.out.println("1) Add a new employee to the employee database \n" +
                "2) Retrieve information about existing employees \n" +
                "3) Update an existing employee information \n" +
                "4) Remove an existing employee");
    }
}
