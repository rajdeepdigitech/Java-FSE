/*

13. Recursive Fibonacci 
• Objective: Implement recursion. 
• Task: Calculate the nth Fibonacci number using recursion. 
• Instructions: 
o Prompt the user for a positive integer n. 
o Define a recursive method fibonacci(int n) that returns the nth Fibonacci number. 
o Display the result.

*/


package CoreJava;

import java.util.Scanner;
import java.lang.IO;

public class File13RecursionFibo {

    static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    
    }

    /*
        Position -> 9 

        0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IO.println("Please enter a positive integer n:");
        int userInput = input.nextInt();

        if (userInput < 0) {
            IO.println("Please enter a non-negative integer!");
        } else {
            int result = fibonacci(userInput);
            IO.println("The Fibonacci number at position " + userInput + " is: " + result);
        }

        input.close();
    }
}
