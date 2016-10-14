package toDoListProgram;
import java.util.Scanner;

/**
 * Created by JoshuaMabry on 10/12/16.
 */
public class Help {

    Scanner input = new Scanner(System.in);

    public void help(){
        Menu menu = new Menu();

        System.out.println("TO DO HELP");
        System.out.println("This program can add, list and remove important items that you need to get done! \n");

        System.out.println("1. Exit to Main");
        int exit = input.nextInt();
        switch (exit){
            case 1:

                menu.startMenu();
                break;
            default:
                System.out.println("Please enter valid selection");
                break;
        }

    }
}
