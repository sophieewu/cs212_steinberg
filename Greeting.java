import java.util.Scanner;

/* A program that asks the user for their name, then says Hello with their name. */
public class Greeting {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Please enter your name: ");

        // Read the user's name as a string
        String name = scanner.nextLine();

        // Print a greeting message with the user's name
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
