package calculator;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
/**
 * Created by JoshuaMabry on 10/11/16.
 */

public class GroceryCalculator {

    Scanner input = new Scanner(System.in);
    ArrayList<Double> addGroceryItems = new ArrayList<>();
    public static ArrayList<Double> groceryCalculatorList = new ArrayList<>();
    boolean runLoop = true;
    double total = 0;
    Menu menu = new Menu();

    public void groceryCalculator() throws IOException{

        System.out.println("Please enter first item price");
        double item1 = input.nextDouble();
        addGroceryItems.add(item1);

        while(runLoop) {

            System.out.println("Do you want to enter another item: y/n ");
            String anotherItem = input.next();

            switch(anotherItem){
                case "y":
                    System.out.println("Enter next item: ");
                    double nextItem = input.nextDouble();
                    addGroceryItems.add(nextItem);
                    break;
                case "n":
                    runLoop = false;
                    break;
            }
        }

        for (int i = 0; i < addGroceryItems.size(); ++i ) {
            // Add Grocery Items together
            total += addGroceryItems.get(i);
            total = Math.round(total * 100.0) / 100.0;
        }

        // Calculate tax amount
        double taxAmount = total * .06;
        taxAmount = Math.round(taxAmount * 100.0) / 100.0;

        // Add tax and total
        double grandTotal = taxAmount + total;
        grandTotal = Math.round(grandTotal * 100.0) / 100.0;

        // Print values to the screen
        System.out.println("Your bill of " + total + " ");
        System.out.println("has a tax total of " + taxAmount);
        System.out.println("Your grand total is " + grandTotal);

        //Save answer to Array
        groceryCalculatorList.add(grandTotal);

        // Print Answer to External Text File
        String fileName = "GroceryCalculator.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
        outFile.println("Your bill of " + total + " ");
        outFile.println("has a tax total of " + taxAmount);
        outFile.println("Your grand total is " + grandTotal + "\n");
        outFile.close();

//        // Run Grocery Calculator again?
//        System.out.println("Do you want to calculate any more items: y/n");
//        String anotherItem = input.next();
//        switch (anotherItem){
//            case "y":
//                groceryCalculator();
//                break;
//            case "n":
                menu.startMainMenu();
//                break;
        }

    }
//}
