/*
2. Simple Calculator 
• Objective: Practice arithmetic operations and user input. 
• Task: Develop a calculator that performs addition, subtraction, multiplication, and division. 
• Instructions: 
o Prompt the user to enter two numbers. 
o Ask the user to choose an operation. 
o Display the result of the operation.


*/

/*
    Logic -> 
    
    While loop, unless user prompt != 5, keep on looping 

    

*/


package CoreJava;

import java.util.Scanner;
import java.lang.IO;

public class File02Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Enter the first number: ");
        int numberOne = sc.nextInt();
        IO.println("Enter the second number");
        int numberTwo = sc.nextInt();

        boolean userChoice = true;

        while (userChoice) {
            IO.println("Enter the operation number:\n1. Add\n2. Subtract\n3. Multiplication\n4. Division\n5. Quit" );
            int choice = sc.nextInt();

            if (choice == 1) {
                int result = numberOne + numberTwo;
                IO.println("Your sum is " + result );
            }
            else if (choice == 2) {
                int result = numberOne - numberTwo;
                IO.println("Your subtraction is " + result);
            }
            else if (choice == 3) {
                int result = numberOne * numberTwo;
                IO.println("Your multiplication is " + result);
            }
            else if (choice == 4) {
                int result = numberOne / numberTwo;
                IO.println("Your division is " + result);
            }
            else {
                IO.println("Choose between options 1-4 only to continue!");
                userChoice = false; 
            }

        }


        sc.close();
    }
    
}
