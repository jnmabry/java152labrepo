package calculator;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by JoshuaMabry on 10/11/16.
 */
public class BasicMath {

    public static ArrayList<Double> basicMath = new ArrayList<>();

    Menu menu = new Menu();

    public void basicMath() throws IOException {
        double answer = 0;

        //Initialize Input Scanner
        Scanner input = new Scanner(System.in);

        // User input
        System.out.println("Enter first number:");
        double a = input.nextDouble();

        System.out.println("Enter operator: + - * / ");
        String o = input.next();

        System.out.println("Enter second number: ");
        double b = input.nextDouble();

        // Do the math
        switch (o) {
            case "+":
            answer = a+b;
                break;
            case "-":
            answer = a-b;
                break;
            case "*":
            answer = a*b;
                break;
            case "/":
            answer = a/b;
                break;
        }

        // Print Answer
        System.out.println(a + " " + o + " " + b + " = " +  answer);

        //Save answer to Array
        basicMath.add(answer);

        // Print Answer to External Text File
        String fileName = "BasicMath.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
        outFile.println(a + " " + o + " " + b + " = " +  answer + "\n");
        outFile.close();


        // Make another calculation
        System.out.println("Do you want to make another calculation: y/n");
        String another = input.next();
        switch (another){
            case "y":
                basicMath();
                break;
            case "n":
                menu.startMainMenu();
        }
    }
}
