package employee_csv_proj.controller.start;

import employee_csv_proj.controller.display.DisplayManager;

import java.util.Scanner;

public class QueryLoader {

    public static void start() {

        Scanner scanner = new Scanner(System.in);

        DisplayManager.requestCommand();
        int commandNumber = scanner.nextInt();
        scanner.nextLine();

        switch (commandNumber) {
            case 1:
                // user wants to add a new employee

                break;
            case 2:
                // user wants to retrieve data about an existing employee
                System.out.println("Enter Employee ID or name: ");
                String idorName = scanner.nextLine();
                boolean isId = true;
                for (char letterOrNum : idorName.toCharArray()) {
                    if (letterOrNum > 64 && letterOrNum < 91) {
                        isId = false;
                    }
                    if (letterOrNum > 96 && letterOrNum < 123) {
                        isId = false;
                    }
                }
                if (isId) {
                    System.out.println("Retrieving information about Employee ID No." + idorName + ":");
                    System.out.println("ID: " + idorName + ", Name: James Potter, Gender: M, Salary: 65873");
                } else {
                    System.out.println("Retrieving information about " + idorName + ":");
                    System.out.println("ID: 453462, Name: " + idorName + ", Gender: M, Salary: 134764");
                }
                break;
            case 3:
                // user want to update information about an existing employee

                break;
            case 4:
                // user wants to delete information about an existing employee

                break;
        }


    }
}
