package ZooProgram;
import java.util.Scanner;
/**
 * Created by JoshuaMabry on 10/13/16.
 */
public class MainMenu {

    public void startMainMenu(){

        AddItems addItems = new AddItems();
        VisitorMenu visitor  = new VisitorMenu();
        EmployeeMenu employeemenu = new EmployeeMenu();

        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        // Print User Menu
        System.out.println("Welcome to the Virtual Zoo \n");
        System.out.println("Please select your status: ");
        System.out.println("1. Employee Workstation ");
        System.out.println("2. Visitor Kiosk ");

        //Input Menu Choice
        int menu = input.nextInt();
        switch (menu){
            case 1:
                employeemenu.employeeMenu();
                break;
            case 2:
                visitor.visitorMenu();
                break;
            default:
                System.out.println("Please make valid selection");
                startMainMenu();
        }

    }

}
