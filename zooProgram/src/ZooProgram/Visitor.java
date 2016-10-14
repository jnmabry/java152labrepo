package ZooProgram;
import java.util.Scanner;

/**
 * Created by JoshuaMabry on 10/13/16.
 */
public class Visitor extends Person {

    int visitorNumber;

    public Visitor(String n, int a, int z, int v) {
        super(n, a, z);
        visitorNumber = v;
    }
}
