package ZooProgram;
import java.util.Scanner;

/**
 * Created by JoshuaMabry on 10/14/16.
 */
public class EmployeeMenu {

    Scanner input = new Scanner (System.in);
    AddItems additems = new AddItems();
    ListItems listitems = new ListItems();

    public void employeeMenu() {

        // System Print Employee Menu
        System.out.println("Employee Menu \n");
        System.out.println("What would you like to do: ");
        System.out.println("1. Add Animals");
        System.out.println("2. List Animals");
        System.out.println("3. Add Visitors");
        System.out.println("4. List Visitors");
        System.out.println("5. Add Employees");
        System.out.println("6. List Employees");
        System.out.println("7. Quit");

        //Employee Choice Input to Sub Menus
        int employeeChoice = input.nextInt();
        switch (employeeChoice) {
            case 1:
                additems.createAnimal();
                employeeMenu();
                break;
            case 2:
                listitems.viewAllAnimals();
                employeeMenu();
                break;
            case 3:
                additems.createVisitor();
                employeeMenu();
                break;
            case 4:
                listitems.viewAllVistors();
                employeeMenu();
                break;
            case 5:
                additems.createEmployee();
                employeeMenu();
                break;
            case 6:
                listitems.viewAllEmployees();
                employeeMenu();
                break;
            case 7:
                System.out.println("Thanks for visiting the Employee Kiosk");
                break;
            default:
                System.out.println("Please make a valid selection");
                break;
        }

    }
}
