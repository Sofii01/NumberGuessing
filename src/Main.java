//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfTries = 0;
        int numberToGuess = NumberGuessingGame.numberGenerate();
        boolean hasGuessedCorrectly = false;
        Scanner input = new Scanner(System.in);



        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Have 10 tries. Try to guess it!");
        System.out.println(numberToGuess);
        while(!hasGuessedCorrectly){
            System.out.println("Enter your guess: ");
            int number = input.nextInt();
            numberOfTries++;

            if (number < numberToGuess){
                System.out.println("Too low. Try Again!");
            } else if (number > numberToGuess) {
                System.out.println("To high. Try Again!");
            }else {
                System.out.println("Correct! You've guessed the number in " + numberOfTries + " tries.");
                hasGuessedCorrectly = true;
            }

            if(numberOfTries == 10){
                System.out.println("You lose, didn't guess the number " + numberToGuess);
                hasGuessedCorrectly = true;
            }
        }



    }
}