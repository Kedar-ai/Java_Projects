package numberguessgame;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        int attempts = 0;
        int userGuess = -1;  // Initialize with a value that won't be the target number
        
        while (userGuess != targetNumber && attempts < 10) {
            System.out.print("Take a guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        if (attempts >= 10) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + targetNumber);
        }
    }
}

