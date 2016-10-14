package calculator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by JoshuaMabry on 10/11/16.
 */
public class PastCalculations {
    Menu menu = new Menu();
    Scanner input = new Scanner(System.in);

    public void pastCalculations() throws IOException {

        System.out.println("View Past Calculations: \n");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Tip Calculator");
        System.out.println("3. Grocery Tax Calculator");
        System.out.println("4. Clear all past commands");
        System.out.println("5. Exit to Main");

        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                for (int i = 0; i < BasicMath.basicMath.size(); i++) {
                    int numberPlace = i + 1;
                    System.out.println(numberPlace + "." + " " + BasicMath.basicMath.get(i));
                }
                break;
            case 2:
                for (int i = 0; i < TipCalculator.tipCalculatorList.size(); i++) {
                    int numberPlace = i + 1;
                    System.out.println(numberPlace + "." + " " + TipCalculator.tipCalculatorList.get(i));
                }
                break;
            case 3:
                for (int i = 0; i < GroceryCalculator.groceryCalculatorList.size(); i++) {
                    int numberPlace = i + 1;
                    System.out.println(numberPlace + "." + " " + GroceryCalculator.groceryCalculatorList.get(i));
                }
                break;
            case 4:
                removePastCommands();
                break;
            case 5:
                menu.startMainMenu();
            default:
                System.out.println("Make a valid selection");
                break;
        }

        // Run Grocery Calculator again?
        System.out.println("Do you want to view anymore past calculations: y/n");
        String anotherItem = input.next();
        switch (anotherItem) {
            case "y":
                pastCalculations();
                break;
            case "n":
                menu.startMainMenu();
                break;
        }
    }

    public void removePastCommands() throws IOException{
        System.out.println("Do you want to remove any commands: y/n");
        input.nextLine();
        String removeCommands = input.nextLine();
        switch (removeCommands){
            case "y":
                //Clear all Arrays
                BasicMath.basicMath.clear();
                TipCalculator.tipCalculatorList.clear();
                GroceryCalculator.groceryCalculatorList.size();

                // Clear Text files
                String fileName = "BasicMath.txt";
                PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
                outFile.println("");
                outFile.close();

                // Print Answer to External Text File
                String fileName2 = "TipCalculator.txt";
                outFile = new PrintWriter(new FileWriter(fileName2));
                outFile.println(" ");
                outFile.close();

                String fileName3 = "GroceryCalculator.txt";
                outFile = new PrintWriter(new FileWriter(fileName3));
                outFile.println(" ");
                outFile.close();

                System.out.println("All files cleared!");
                break;

            case "n":
                pastCalculations();
                break;
        }
    }
}