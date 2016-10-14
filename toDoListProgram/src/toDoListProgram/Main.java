package toDoListProgram;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        // Generate Arrays from Old Lists
        ListItems listitems = new ListItems();
        listitems.generateLists();

        // Start the Program
        Menu menu = new Menu();
        menu.startMenu();

    }
}
