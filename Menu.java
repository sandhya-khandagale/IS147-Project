import java.util.Scanner;
public class Menu {

    // Displays a menu for user to enter, retrieve, see a summary of contacts, or exit the program
    public String contactMenu() {
        return """
                ***ADDRESS BOOK***"
                1. Enter a new contact
                2. Retrieve a contact
                3. Summary of contacts
                4. Exit""";
        }

    // Allows user to input their own selection to choose from displayed menu
    public int input() {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your selection: ");
        return input.nextInt();
        }
    }
