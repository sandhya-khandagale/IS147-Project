// Scanners
import java.util.Scanner;
import java.util.Date;
public class Note {

        // Inputs the date when the contact was created
        private java.util.Date dateCreated;
        private String name;
    private String contacts;

        public Note() {
            dateCreated = new java.util.Date();
        }

        // Methods that retrieve an individual contact or a summary of the contacts
        public String retrieveContact()
    {
        return this.contacts;
    }
        public String retrieveName()
    {
        return this.name;
    }
        public String retrieveSummary()
    {
        return dateCreated + " Name: " + this.name;
    }

    // Allows user to enter a new contact name and phone number
    public void enterContact() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the contact at prompt");
        System.out.print("Enter name: ");
        this.name = in.nextLine();

        System.out.println("Enter contact's phone number at prompt");
        System.out.print("Enter number: ");
        contacts = in.nextLine();
        dateCreated = new Date();

        }
    }
