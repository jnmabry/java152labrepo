package calculator;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by JoshuaMabry on 10/11/16.
 */
public class TipCalculator {

    public static ArrayList<Double> tipCalculatorList = new ArrayList<>();

    Menu menu = new Menu();
    Scanner input = new Scanner(System.in);
    double tipPercentage;

    public void tipCalculator() throws IOException{

        System.out.println("Please enter bill total: ");
        double billTotal = input.nextDouble();

        System.out.println("Please rate your level of service from 1 to 4, 4 being excellent: ");
        String serviceLevel = input.next();

        switch (serviceLevel){
            case "1":
                tipPercentage = billTotal * .05;
                break;
            case "2":
                tipPercentage = billTotal * .10;
                break;
            case "3":
                tipPercentage = billTotal * .15;
                break;
            case "4":
                tipPercentage = billTotal * .20;
                break;
        }

        // Print Answer to Screen
        double totalAmount = billTotal + tipPercentage;
        System.out.println("Your bill total is: " + totalAmount);

        //Save answer to Array
        tipCalculatorList.add(totalAmount);

        // Print Answer to External Text File
        String fileName = "TipCalculator.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
        outFile.println("Your bill total is: " + totalAmount + "\n");
        outFile.close();

        // Make another calculation
        System.out.println("Do you want to make another calculation: y/n");
        String another = input.next();
        switch (another){
            case "y":
                tipCalculator();
                break;
            case "n":
                menu.startMainMenu();
        }

    }
}
