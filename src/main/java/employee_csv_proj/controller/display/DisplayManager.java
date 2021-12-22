package employee_csv_proj.controller.display;

public class DisplayManager {

    public static void requestCommand() {
        System.out.println("Please select what you would like to do: ");
        System.out.println("1) Add a new employee to the employee database \n" +
                "2) Retrieve information about existing employees ");
    }

    public static void requestEmployeeID() {
        System.out.println("Please enter employee ID: ");
    }

    public static void requestHonoraryTitle() {
        System.out.println("Please select the honorary title: ");
    }

    public static void requestFirstName() {
        System.out.println("Please enter employee first name: ");
    }

    public static void requestMiddleNameInitial() {
        System.out.println("Please enter employee middle name initial: ");
    }

    public static void requestLastName() {
        System.out.println("Please enter employee last name: ");
    }

    public static void requestGender() {
        System.out.println("Please enter employee gender: ");
    }

    public static void requestEmail() {
        System.out.println("Please enter employee email: ");
    }

    public static void requestDateOfBirth() {
        System.out.println("Please enter employee date of birth (mm/dd/yyyy): ");
    }

    public static void requestDateOfJoining() {
        System.out.println("Please enter employee date of joining (mm/dd/yyyy): ");
    }

    public static void requestSalary() {
        System.out.println("Please enter employee salary: ");
    }

    public static void displayStartOver() {
        System.out.println("Would you like to perform another action? (Yes / No)");
    }
}
