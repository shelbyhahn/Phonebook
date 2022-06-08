// Programmer: Shelby Hahn
// Date: 5/2/22
// Class: CS &145
// Assignment: Phonebook
// What will this program do?: PhonebookManager

import javafx.scene.Node;
import java.util.*;
import java.util.LinkedList;

public class PhonebookManager {

    private PhonebookNode front;
    private String nameFirst;
    private String nameLast;
    private String address;
    private String number;
    private PhonebookNode next;

/*    public void main(String[] args) {

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


    // adds node at the end of phonebook
    public void add(String nameFirst, String nameLast,
                    String address, String number) {

        // set the given node to a new node
        PhonebookNode newNode = new PhonebookNode(nameFirst, nameLast, address, number);

        newNode.setNameFirst(nameFirst);
        newNode.setNameLast(nameLast);
        newNode.setAddress(address);
        newNode.setNumber(number);

        if (front == null) {
            // sets the start of the list
            front = new PhonebookNode(nameFirst, nameLast, address, number);
            return;
        }
        // makes the next node null
        newNode.setNext(null);

        // starts at the front and goes through till it reaches the end
        PhonebookNode current = front;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // Change the next of last node
        current.setNext(newNode);
        return;
    }

    // deletes a node by last name
    public void delete(String key) {
        // Store head node
        PhonebookNode temp = front;
        PhonebookNode prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.getNameLast() == key) {
            front = temp.getNext(); // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.getNameLast() != key) {
            prev = temp;
            temp = temp.getNext();
        }

        // If key was not present in linked list
        if (temp == null) {
            return;
        }

        // Unlink the node from linked list
        prev.setNext(temp.getNext());
    }

    // prints out the phonebook
    public void printList() {
        PhonebookNode tnode = front;

        while (tnode != null) {
            System.out.print("\n" + tnode.getNameLast() + ", " + tnode.getNameFirst() +
                    "\nAddress: " + tnode.getAddress() +
                    "\nCity: Bellingham" +
                    "\nPhone number: " + tnode.getNumber() + "\n");
            tnode = tnode.getNext();
        }
    }
    
    public void updateContact(String nameFirst, String setNameFirst) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter name of contact you'd like to update: ");
      String getNameFirst = input.nextLine();
      System.out.println("Enter the updated name of contact: ");
      setNameFirst = input.nextLine();  
        
      }
   
}