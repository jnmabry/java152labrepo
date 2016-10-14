package ZooProgram;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by JoshuaMabry on 10/14/16.
 */
public class AddItems {

    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);

    Zoo zoo = new Zoo();
    public void createEmployee(){

        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Please enter your age: ");
        int age = inputInt.nextInt();
        System.out.println("Please enter your zip code: ");
        int zipCode = inputInt.nextInt();
        System.out.println("Please enter your ID Number: ");
        int idNumber= inputInt.nextInt();

        Employee e1 = new Employee(name,age,zipCode,idNumber);
        zoo.employeeList.add(e1);
        System.out.println(Zoo.employeeList.size());

    }

    public void createAnimal(){

        System.out.println("Please enter Animals name: ");
        String name = input.nextLine();
        System.out.println("Please enter Animals age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Please enter Animals sex: ");
        String sex = input.nextLine();

        Animal a1 = new Animal(name,age,sex);
        zoo.animalList.add(a1);
        System.out.println(Zoo.animalList.size());


    }

    public void createVisitor(){

        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Please enter your zip code: ");
        int zipCode = input.nextInt();
        System.out.println("Please enter your Visitor Number: ");
        int visitorNumber = input.nextInt();

        Visitor v1 = new Visitor(name,age,zipCode,visitorNumber);
        zoo.visitorList.add(v1);
        System.out.println(Zoo.visitorList.size());
    }

}


//
//
//    public createPerson (ArrayList array){
//
//        System.out.println("Please enter your name: ");
//        name = input.nextLine();
//        System.out.println("Please enter your age: ");
//        age = input.nextInt();
//        System.out.println("Please enter your zip code: ");
//        zipCode = input.nextInt();
//
//        Person p1 = new Person(name,age,zipCode);
//        array.add(p1);
//        System.out.println(array.size());
//        return array;
//    }