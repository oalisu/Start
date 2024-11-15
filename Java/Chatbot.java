import java.util.Scanner;

public class Chatbot {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("\nHello! Whats your name?");
        String name = scanner.nextLine();

        System.err.println("\nHi " + name + "! I am Javabot. Where are you from?");
        String location = scanner.nextLine();
        

        System.err.println("\nI heard " + location + " is beautiful! I am from a place called Oracle. \nHow old are you?");
        int age = scanner.nextInt();
        int age1 = 400;

        System.err.println("\nSo you are " + age + ", cool! I am " + age1 + " years old.");
        System.err.println("This means I am " + (age1 / age) + " times older than you.");
        System.err.println("Enough about me... What is your favorite language? (Please don't say Python.)");
        String language = scanner.next();
       
        System.err.println("\n" + language + ", thats great! Nice chatting with you, " + name + " I have to log off now, see you!");

        scanner.close();

    }

}
