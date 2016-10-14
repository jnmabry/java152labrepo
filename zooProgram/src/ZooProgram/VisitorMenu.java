package ZooProgram;

import java.util.Scanner;

/**
 * Created by JoshuaMabry on 10/14/16.
 */
public class VisitorMenu {
    ListItems listitems = new ListItems();

    public void visitorMenu(){

        //Initialize Scanner
        Scanner input = new Scanner(System.in);

        // System Print Employee Menu
        System.out.println("Visitor Menu \n");
        System.out.println("What would you like to do: ");
        System.out.println("1. View Exhibits");
        System.out.println("2. Quit");

        int visitorMenu = input.nextInt();

        switch (visitorMenu){
            case 1:
                listitems.viewAllAnimals();
                visitorMenu();
                break;
            case 2:
                System.out.println("Thanks for visiting the Virtual Zoo!");
                break;
            default:
                System.out.println("Please make a valid selection");
        }
    }
}
