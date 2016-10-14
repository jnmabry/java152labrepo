package toDoListProgram;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;

/**
 * Created by JoshuaMabry on 10/12/16.
 */

public class ListItems {

    public void listItems() throws IOException {

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("What list would you like to view:");
        System.out.println("1. Grocery List");
        System.out.println("2. Personal List ");
        System.out.println("3. Business List");
        int viewList = input.nextInt();

        switch (viewList) {
            case 1:
                for (int i = 0; i < AddItems.GroceryItems.size(); ++i) {
                    int getCount = i + 1;
                    System.out.println(getCount + " " + AddItems.GroceryItems.get(i));
                }
                break;

            case 2:

                for (int i = 0; i < AddItems.PersonalItems.size(); i++) {
                    int getCount = i + 1;
                    System.out.println(getCount + " " + AddItems.PersonalItems.get(i));
                }
                break;

            case 3:
                for (int i = 0; i < AddItems.BusinessItems.size(); i++) {
                    int getCount = i + 1;
                    System.out.println(getCount + " " + AddItems.BusinessItems.get(i));
                }
                break;

            default:
                System.out.println("Make a valid section");
                listItems();
                break;
        }

        System.out.println("Would you like to view another list: y/n");
        String anotherList = input.next();
        switch (anotherList) {
            case "y":
                listItems();
                break;
            case "n":
                menu.startMenu();
                break;
        }
    }

    public void printLists() throws IOException {

        // Prints All New Information to Text Files

        // Print Answer to External Text File
        String fileName = "GroceryItems.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
        for (int i = 0; i < AddItems.GroceryItems.size(); i++) {
            int getCount = i + 1;
            outFile.println(getCount + " " + AddItems.GroceryItems.get(i));
        }
        outFile.close();

        // Print Answer to External Text File
        fileName = "PersonalItems.txt";
        outFile = new PrintWriter(new FileWriter(fileName, true));
        for (int i = 0; i < AddItems.PersonalItems.size(); i++) {
            int getCount = i + 1;
            outFile.println(getCount + " " + AddItems.PersonalItems.get(i));
        }
        outFile.close();

        // Print to external text file
        fileName = "BusinessItems.txt";
        outFile = new PrintWriter(new FileWriter(fileName, true));

        for (int i = 0; i < AddItems.BusinessItems.size(); i++) {
            int getCount = i + 1;
            outFile.println(getCount + " " + AddItems.BusinessItems.get(i));
            System.out.println(getCount + " " + AddItems.BusinessItems.get(i));
        }
        outFile.close();

    }

    public void clearLists() throws IOException {

        // Clears all old info from text file

        String fileName = "GroceryItems.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
        outFile.close();

        // Print Answer to External Text File
        fileName = "PersonalItems.txt";
        outFile = new PrintWriter(new FileWriter(fileName));
        outFile.close();

        fileName = "BusinessItems.txt";
        outFile = new PrintWriter(new FileWriter(fileName));
        outFile.close();

    }

    public boolean generateLists() throws IOException {

        Scanner inFile = new Scanner(new FileReader("GroceryItems.txt"));
        String groceryItems;
        while (inFile.hasNextLine()) {
            groceryItems = inFile.nextLine();
            AddItems.GroceryItems.add(groceryItems);
        }

        Scanner groceryFile = new Scanner(new FileReader("PersonalItems.txt"));
        String personalItems;
        while (groceryFile.hasNextLine()) {
            personalItems = groceryFile.nextLine();
            AddItems.PersonalItems.add(personalItems);
        }

        Scanner workFile = new Scanner(new FileReader("BusinessItems.txt"));
        String businessItems;
        while (workFile.hasNextLine()) {
            businessItems = workFile.nextLine();
            AddItems.BusinessItems.add(businessItems);
        }
        // end of while statements
        return true;
    }
}
