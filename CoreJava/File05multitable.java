/*
5. Multiplication Table 
• Objective: Implement loops. 
• Task: Print the multiplication table for a number up to 10. 
• Instructions: 
o Prompt the user for a number. 
o Use a for loop to iterate from 1 to 10. 
o Multiply the input number by the loop counter and display the result. 

*/


package CoreJava;

import java.util.Scanner;
import java.lang.IO;

public class File05multitable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IO.println("Enter a number!: ");
        int userInput = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            IO.println(userInput + " * " + i + " = " + userInput * i );
        }

        input.close();

    }
}
