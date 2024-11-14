import java.util.Scanner;

public class WorkbookFour {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.err.println("\nWelcome to Javagram! Please enter a few details to sign up:");
    
    System.err.println("\nEnter your first name:");
    String name = scanner.next();

    System.err.println("\nEnter your last name:");
    String lastName = scanner.next();

    System.err.println("\nEnter your age:");
    int age = scanner.nextInt();
 
    System.err.println("\nEnter an Username:");
    String username = scanner.next();

    System.err.println("\nHeres is all the information you entered:");
    System.err.println("Fisrt Name: " + name);
    System.err.println("Last name: " + lastName);
    System.err.println("Your Age: " + age);
    System.err.println("Your Username: " + username);

    scanner.close();

}

}
