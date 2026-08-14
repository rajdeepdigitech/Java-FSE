/*
3. Even or Odd Checker 
• Objective: Utilize conditional statements. 
• Task: Determine if a number entered by the user is even or odd. 
• Instructions: 
o Prompt the user for an integer. 
o Use the modulus operator % to check divisibility by 2. 
o Display whether the number is even or odd.

*/

package CoreJava;

import java.lang.IO;
import java.util.Scanner;

public class File03oddeve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IO.println("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            IO.println("The number is even!");
        }
        else {
            IO.println("The number is odd!");
        }

        
        input.close();
    }
    
}
