import java.util.Scanner;
public class Controller {

        // Private members
        // Capacity of the address book is set to 3
        private final Menu menu;
        private int index = 0;
        private final Note[] contacts;

        // Triggers the main loop from the Controller class
        public Controller() {
            this.menu = new Menu();
            int i = 3;
            this.contacts = new Note[i];
            this.mainLoop();
        }

        // Main loop
        private void mainLoop() {
            boolean exit = false;
            int selection;

            Scanner scan = new Scanner(System.in);
            while (!exit) {
                System.out.println(menu.contactMenu());
                selection = menu.input();

                // Switch statement
                switch (selection) {
                    // Option 1: User enters a new contact
                    case 1:
                        if(index != 3) {
                            System.out.println("***Entering a new contact**");
                            Note note = new Note();
                            note.enterContact();
                            contacts[index++] = note;
                        }
                        else {
                            System.out.println("You have exceeded the max amount of contacts. Please select another option.");
                        }
                        break;

                    // Option 2: User retrieves a contact
                    case 2:
                        System.out.println("There are currently " + index + " contact(s)");
                        System.out.println("Enter which contact you want to retrieve: ");
                        int contactNumber = scan.nextInt();
                        System.out.println("Contact " + contactNumber + ": ");
                        contactNumber -= 1;
                        contacts[contactNumber].retrieveContact();
                        System.out.println("Name: "+contacts[contactNumber].retrieveName());
                        System.out.println("Number: "+contacts[contactNumber].retrieveContact());
                        break;

                    // Option 3: User accesses a summary of the contacts
                    case 3:
                        System.out.println("There are currently " + index + " contact(s)");
                        for (int i = 0; i < index; i++) {
                            System.out.println(contacts[i].retrieveSummary());
                        }
                        break;

                    // Option 4: User exits the program
                    case 4:
                        System.out.println("***Exiting address book***");
                        exit = true;
                        break;
                    default: System.out.println("Incorrect selection.");
                        break;
                }
            }

            System.out.println("Program has been exited by user.");
        }

    }
