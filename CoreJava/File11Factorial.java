/*
11. Factorial Calculator 
• Objective: Use loops to perform repetitive calculations. 
• Task: Calculate the factorial of a number entered by the user. 
• Instructions: 
o Prompt the user for a non-negative integer. 
o Use a for loop to calculate the factorial. 
o Display the result. 


*/

// Took help from Claude

package CoreJava;

import java.lang.IO;
import java.util.Scanner;
import java.math.BigInteger;

public class File11Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        IO.println("Please enter a number: ");
        int userInput = input.nextInt();
        BigInteger factorial = BigInteger.ONE;
        IO.println("The default value : " + factorial);
        for (int i = 1; i <= userInput; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        IO.println("The factorial of the number is " + factorial);
        input.close();
    }
    
}
