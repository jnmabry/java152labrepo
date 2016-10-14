package ZooProgram;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JoshuaMabry on 10/13/16.
 */
public class Employee extends Person {

    int idNumber;


    public Employee(String n, int a, int z, int id) {
        super(n, a, z);
        idNumber = id;
    }

    public String displayPersonInfo(){
        String displayEmployeeInfo = super.displayPersonInfo();
        return displayEmployeeInfo +
                "Identification Number: " + idNumber + "\n";
    }

}
