package toDoListProgram;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


/**
 * Created by JoshuaMabry on 10/12/16.
 */
public class AddItems {

    int importance = 0;
    int counter;

    //Initialize Scanner and new class instances
    Scanner input = new Scanner(System.in);
    public static ArrayList<String> GroceryItems = new ArrayList<>();
    public static ArrayList<String> PersonalItems = new ArrayList<>();
    public static ArrayList<String> BusinessItems = new ArrayList<>();

    public void addItemsMenu() {

        try {
            //  Menu for Add Items
            System.out.println("What kind of item would you like to add?");
            System.out.println("1. Grocery");
            System.out.println("2. Personal");
            System.out.println("3. Work");
            int inputNumber = input.nextInt();

            switch (inputNumber) {
                case 1:
                    addItem(GroceryItems);
                    break;
                case 2:
                    addItem(PersonalItems);
                    break;
                case 3:
                    addItem(BusinessItems);
                    break;
                default:
                    System.out.println("Please enter a valid selection");
                    addItemsMenu();
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList addItem (ArrayList array) throws IOException {
        Menu menu = new Menu();
        boolean runLoop = true;

        addImportance(counter);
//        System.out.println("Your importance is: " + importance);
        System.out.println("Please enter first item:");
        input.nextLine();
        String item = input.nextLine();
        array.add(importance,item);

        while (runLoop) {
            System.out.println("Do you want to enter another item: y/n ");
            String anotherItem = input.nextLine();

            switch (anotherItem) {
                case "y":
                    counter = counter++;
                    addImportance(counter);
                    System.out.println("Enter next item: ");
                    String nextItem = input.nextLine();
                    array.add(importance,nextItem);
                    counter = counter + 1;
                    break;
                case "n":
                    runLoop = false;
                    menu.startMenu();
                    break;
            }
        } return array;
    }

    public int addImportance(int counter){
        Scanner input = new Scanner(System.in);
        // Level of Importance Menu
        System.out.println("How important is this item?");
        System.out.println("1 - Very important 0 - Not Important");
        int inputImportance = input.nextInt();

        // User input Level of Importance
        switch (inputImportance){
            case 0:
//                System.out.println("This is not very Important");
                importance = counter;
                break;

            case 1:
//                System.out.println("This is very Important");
                importance = 0;
                break;
            default:
                System.out.println("This is not a valid number");
                addImportance(counter);
                break;
        }
    return importance;
    }
}
