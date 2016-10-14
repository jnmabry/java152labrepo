package calculator;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by JoshuaMabry on 10/11/16.
 */
public class Menu {

    public void startMainMenu(){

        try {
            // Creating new instances of classes
            BasicMath m1 = new BasicMath();
            TipCalculator m2 = new TipCalculator();
            GroceryCalculator m3 = new GroceryCalculator();
            PastCalculations m4 = new PastCalculations();
            Help m5 = new Help();

            // Initiate Scanner Object
            Scanner inputChoice = new Scanner(System.in);

            // Main Menu Screen
            System.out.println("\n");
            System.out.println("Please choose your calculator: ");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Tip Calculator");
            System.out.println("3. Grocery Tax Calculator");
            System.out.println("4. View Past Calculations");
            System.out.println("5. Help");
            System.out.println("6. Quit");

            int answer = inputChoice.nextInt();

            switch (answer) {
                case 1:
                    m1.basicMath();
                break;
                case 2:
                    m2.tipCalculator();
                    break;
                case 3:
                    m3.groceryCalculator();
                    break;
                case 4:
                    m4.pastCalculations();
                    break;
                case 5:
                    m5.help();
                    break;
                case 6:
                    System.out.println("Have a nice day!");
                    System.exit(6);
                    break;
                default:
                    System.out.println("Please choose from 1-6");
                    startMainMenu();
            }
        } catch(InputMismatchException error1){
            System.out.println("Please choose a given menu item");
            startMainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
