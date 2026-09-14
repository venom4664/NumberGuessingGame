import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 7;
        boolean guessed = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts && !guessed) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Correct! You guessed in " + attempts + " attempts.");
                guessed = true;
            } else if (guess < numberToGuess) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }
        }

        if (!guessed) {
            System.out.println("You lost! The number was " + numberToGuess);
        }
        sc.close();
    }
}
