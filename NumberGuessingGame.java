import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1; // generate a random number between 1 and 100
        int userGuess;
        int numGuesses = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numGuesses++;

            if (userGuess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations, you guessed the number in " + numGuesses + " guesses!");
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }
}
