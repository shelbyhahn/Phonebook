// Programmer: Shelby Hahn
// Date: 5/2/22
// Class: CS &145
// Assignment: Phonebook
// What will this program do?: PhonebookMain

import java.io.IOException;
import java.util.*;

public class PhonebookMain {

    public static void main(String[] args) throws IOException {
        // intiializing manager
        PhonebookManager bellingham = new PhonebookManager();

        bellingham.add("Shelby", "Hahn", "123 Main St", "6433389");
        bellingham.add("Gracie", "Shull", "1800 Baker Dr", "7503951");
        bellingham.add("Elaine", "Hsu", "175 Sunset Rd", "7352963");
        bellingham.add("Delete", "Me", "Please", "2853794");

        bellingham.delete("Me");
        bellingham.delete("Too");

        bellingham.printList();
        
        bellingham.updateContact("Shelby", "Susie");
        
        bellingham.printList();

    } // end main

 /*   public void possibleMain() {

        Boolean run = true;
        String option = "";
        Scanner input = new Scanner(System.in);
        PhonebookNode book = new PhonebookNode();

        System.out.println("This is the phonebook manager!");

        while(run) {
            System.out.println("Please select an option");
            System.out.println("(1) add an entry to the phonebook");
            System.out.println();

            option = input.nextLine();

            switch(option) {
                case "1":
                    inputToPhonebook(book, input);
                    break;
                default:
                    break;
            } // end switch case
        } // end while loop

    } // end main */

} // end class PhonebookMain
   


   