import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a Random object to generate a random number
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        int userGuess = 0; // Initialize user guess to 0
        boolean done = false; // Flag to track if the user has guessed correctly

        // Start the guessing game
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop until the user guesses correctly
        while (!done) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            // Check the user's guess
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again: ");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again: ");
            } else {
                System.out.println("Correct! The number was " + numberToGuess + ".");
                done = true; // Set the flag to true to exit the loop
            }
        }

        // Close the scanner
        scanner.close();
    }
}
