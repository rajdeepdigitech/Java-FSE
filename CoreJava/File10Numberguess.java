/*
10. Number Guessing Game 
• Objective: Implement loops and conditional logic. 
• Task: Create a game where the user guesses a randomly generated number. 
• Instructions: 
o Generate a random number between 1 and 100. 
o Prompt the user to guess the number. 
o Provide feedback if the guess is too high or too low. 
o Continue until the user guesses correctly. 


*/

package CoreJava;

import java.util.Scanner;
import java.util.Random;
import java.lang.IO;

public class File10Numberguess {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner input = new Scanner(System.in);


        int guessNumber = rn.nextInt(101); // Task one complete 
        boolean notMatched = true;
        while (notMatched) {
            IO.println("Please guess a number!");
            int userInput = input.nextInt();

            if (userInput == guessNumber) {
                IO.println("Your guess was correct!");
                notMatched = false;
            }
            else if (userInput < guessNumber) {
                IO.println("Guess higher!");
            }
            else if (userInput > guessNumber) {
                IO.println("Guess lower!");
            }

        }
        

        input.close();
    }
    
}
