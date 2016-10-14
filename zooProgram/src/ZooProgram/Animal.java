package ZooProgram;

/**
 * Created by JoshuaMabry on 10/13/16.
 */
public class Animal {

    String name;
    int age;
    String sex;

    public Animal (String n, int a, String s){
        name = n;
        age = a;
        sex = s;
    }

    public String displayPersonInfo(){
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Sex: " + sex + "\n";
    }
}
