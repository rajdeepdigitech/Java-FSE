/*

20. Try-Catch Example 
• Objective: Handle exceptions gracefully. 
• Task: Handle division by zero using try-catch. 
• Instructions: 
o Prompt the user for two integers. 
o Attempt to divide the first by the second. 
o Catch any ArithmeticException and display an appropriate message. 


*/

package CoreJava;

import java.lang.IO;
import java.util.Scanner;

public class File20TryandCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            IO.println("Enter a number: -> ");
            int x = input.nextInt();
            int result = x / 0;
            IO.println(result);
        }
        catch (ArithmeticException e) {
            IO.println("Invalid!");

        }
        input.close();
    }
    
}
