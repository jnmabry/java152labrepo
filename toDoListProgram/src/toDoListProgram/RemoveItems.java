package toDoListProgram;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by JoshuaMabry on 10/12/16.
 */
public class RemoveItems {

    public void removeItems() throws IOException {

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("What list would you like to remove:");
        System.out.println("1. Grocery List");
        System.out.println("2. Personal List ");
        System.out.println("3. Business List");
        System.out.println("4. Clear All Lists");
        int viewList = input.nextInt();

        switch (viewList){
            case 1:
                for(int i = 0; i < AddItems.GroceryItems.size(); i++){
                    int getCount = i + 1;
                    System.out.println(getCount + " " + AddItems.GroceryItems.get(i));
                }

                    System.out.println("What number would you like to remove: ");
                    int removeItem = input.nextInt();

                    AddItems.GroceryItems.remove(removeItem - 1);
                    System.out.println("Item removed");
                break;

            case 2:

                for(int i = 0; i < AddItems.PersonalItems.size(); i++){
                    int getCount = i + 1;
                    System.out.println(getCount + " " + AddItems.PersonalItems.get(i));
                }
                System.out.println("What number would you like to remove: ");
                removeItem = input.nextInt();

                AddItems.PersonalItems.remove(removeItem - 1);
                System.out.println("Item removed");
                break;

            case 3:
                for(int i = 0; i < AddItems.BusinessItems.size(); i++){
                    int getCount = i + 1;
                    System.out.println(getCount + " " + AddItems.BusinessItems.get(i));
                }

                System.out.println("What number would you like to remove: ");
                removeItem = input.nextInt();

                AddItems.BusinessItems.remove(removeItem - 1);
                System.out.println("Item removed");
                break;

            case 4:
                AddItems.GroceryItems.clear();
                AddItems.BusinessItems.clear();
                AddItems.PersonalItems.clear();

                break;

            default:
                System.out.println("Make a valid section");
                removeItems();
                break;
        }

        System.out.println("Would you like to view another list: y/n");
        String anotherList = input.next();
        switch(anotherList){
            case "y":
                removeItems();
                break;
            case "n":
                menu.startMenu();
        }
    }
}
