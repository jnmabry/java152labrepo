package ZooProgram;

/**
 * Created by JoshuaMabry on 10/14/16.
 */
public class ListItems {

    Zoo zoo = new Zoo();

    public void viewAllAnimals() {

        for (int i = 0; i < zoo.animalList.size(); ++i) {

            System.out.println("Name: " + zoo.animalList.get(i).name);
            System.out.println("Age: " + zoo.animalList.get(i).age);
            System.out.println("Sex: " + zoo.animalList.get(i).sex);
            System.out.println("\n");

        }
    }

    public void viewAllVistors() {

        for (int i = 0; i < zoo.visitorList.size(); ++i) {

            System.out.println("Name: " + zoo.visitorList.get(i).name);
            System.out.println("Age: " + zoo.visitorList.get(i).age);
            System.out.println("Zipcode: " + zoo.visitorList.get(i).zipCode);
            System.out.println("Visitor Number: " + zoo.visitorList.get(i).visitorNumber);

            System.out.println("\n");

        }
    }

    public void viewAllEmployees() {

        for (int i = 0; i < zoo.employeeList.size(); ++i) {

            System.out.println("Name: " + zoo.employeeList.get(i).name);
            System.out.println("Age: " + zoo.employeeList.get(i).age);
            System.out.println("Zipcode: " + zoo.employeeList.get(i).zipCode);
            System.out.println("Visitor Number: " + zoo.employeeList.get(i).idNumber);

            System.out.println("\n");

        }
    }


}