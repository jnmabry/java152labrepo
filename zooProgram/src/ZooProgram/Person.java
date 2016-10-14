package ZooProgram;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JoshuaMabry on 10/13/16.
 */

public class Person {

    Scanner input = new Scanner(System.in);
    int count = 0;

    String name;
    int age;
    int zipCode;

    public Person (String n, int a, int z){
        name = n;
        age = a;
        zipCode = z;
    }

    public String displayPersonInfo(){
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Zip Code: " + zipCode + "\n";
    }

}
