package calculator;
import java.util.Scanner;
/**
 * Created by JoshuaMabry on 10/11/16.
 */
public class Help {
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();

    public void help(){
        System.out.println("**** Help Menu ****");

        System.out.println("Basic Calculator:");
        System.out.println("Enter two numbers, choose operator and let the magic happen! \n");

        System.out.println("Tip Calculator:");
        System.out.println("Calculate your tip according to level of service! \n");

        System.out.println("Grocery Calculator:");
        System.out.println("Add each item you plan on buying at the grocery store in order to get a sum total including tax! \n");

        System.out.println("Past Calculations:");
        System.out.println("View and remove all calculations that the user has entered since opening the program! \n");

        System.out.println("1. Exit to Main Menu");
        int exit = input.nextInt();
        if(exit == 1){
            menu.startMainMenu();
        }
    }
}
