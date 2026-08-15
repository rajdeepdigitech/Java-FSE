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

import java.lang.IO;
import java.util.Scanner;

public class File13RecursionFibo {

    static int incursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n * incursion(n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IO.println("Please enter any number!");
        int userInput = input.nextInt();
        int result = incursion(userInput);

        IO.println(result);

        input.close();
    }

    
}
