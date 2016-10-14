package toDoListProgram;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

/**
 * Created by JoshuaMabry on 10/12/16.
 */
public class Menu {

    // Initialize Scanner and new class instances
    Scanner input = new Scanner(System.in);
    AddItems additems = new AddItems();
    ListItems listitems = new ListItems();
    RemoveItems removeitems = new RemoveItems();
    Help help = new Help();


    public void startMenu(){

try{
        // Main menu user selection
        System.out.println("**** To Do List Program ****");
        System.out.println("Please make a valid selection");
        System.out.println("1. Add Items");
        System.out.println("2. List Items");
        System.out.println("3. Remove Items");
        System.out.println("4. Help");
        System.out.println("5. Quit");

        int userInput = input.nextInt();
        switch(userInput){
            case 1:
                additems.addItemsMenu();
                break;
            case 2:
                listitems.listItems();
                break;
            case 3:
                removeitems.removeItems();
                break;
            case 4:
                help.help();
                break;
            case 5:
                listitems.clearLists();
                listitems.printLists();
                System.out.println("Have a nice day!");
                break;
            default:
                System.out.println("Make a valid section");
                startMenu();
        }
            } catch (IOException e) {
                 e.printStackTrace();
        }
    }
}
