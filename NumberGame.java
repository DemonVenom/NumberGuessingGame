import java.util.*;
import java.util.Random;

public class NumberGame {

    /**
     *   Prompts the user to pick a random number that the program has selected
     *
     *   @author Henry Hoffman
     *   @version 2/1/2021
     */

    public static void main (String [] args) {

        // Create new scanner
        Scanner scnr = new Scanner(System.in);

        // Create character for user to choose between playing again (y) and no (n)
        char gameReplay = '\0';

        // Create do while loop to replay game as many times as necessary
        do {

            // Create random number generator
            Random randomNumber = new Random();

            // Create variable to store computer guess
            int computerGuess = 1 + randomNumber.nextInt(1000);

            // Prompt the user guess the value of computerGuess
            System.out.print("Guess my number between 1 and 1000 => ");

            // Assign user input to userInput
            int userInput = scnr.nextInt();

            // Create counter integer to count the amount of loop iterations
            // (plus the initial guess)
            int counter = 1;
            // Create while loop, under the condition that userInput =/= computerGuess
            while (userInput != computerGuess) {

                // Create if statement, under the condition that userInput > computerGuess
                if (userInput > computerGuess) {

                    // Inform user that input is too high
                    System.out.print("Too high\nGuess again => ");
                    // Assign user input to userInput
                    userInput = scnr.nextInt();

                    // Add +1 to the counter
                    counter++;
                }
                // Create if statement, under the condition that userInput > computerGuess
                if (userInput < computerGuess) {

                    // Inform user that input is too high
                    System.out.print("Too low\nGuess again => ");
                    // Assign user input to userInput
                    userInput = scnr.nextInt();

                    // Add +1 to the counter
                    counter++;
                }
            }
            // Show the user that they won and the amount of guesses
            System.out.printf("You guessed the number!\nYou required %d tries\nDo you want to play again (y or n) => ", counter);

            // Assign next character to gameReplay character
            gameReplay = scnr.next().charAt(0);

        }
        // Create while statement to break do-while loop if the user wants to stop playing
        while (gameReplay == 'y');

    }
}
