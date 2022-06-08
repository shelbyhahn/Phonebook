// Programmer: Shelby Hahn
// Date: 5/2/22
// Class: CS &145
// Assignment: Phonebook
// What will this program do?: This class defines a phonebook node and the add method


import javafx.scene.Node;
import java.util.*;

public class PhonebookNode {

    private PhonebookNode front;

    // change to private
    private String nameFirst;
    private String nameLast;
    private String address;
    private String number;
    private PhonebookNode next;

    //creates new empty phonebook node
    public PhonebookNode() {
        front = null;
    }

    //creates a new node to store info and no next node
    public PhonebookNode(String nameFirst, String nameLast,
                         String address, String number) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.address = address;
        this.number = number;
        this.next = null;
    }

    // get methods, doesnt change the value
    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public PhonebookNode getNext() {
        return next;
    }

    // set methods, changes the values
    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setNext(PhonebookNode next) {
        this.next = next;
    }
}