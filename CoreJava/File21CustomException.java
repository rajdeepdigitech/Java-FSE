/*

21. Custom Exception 
• Objective: Create and use custom exceptions. 
• Task: Define a custom exception InvalidAgeException. 
• Instructions: 
o Throw InvalidAgeException if the user's age is less than 18. 
o Catch the exception and display a message. 

*/

package CoreJava;

import java.lang.IO;
import java.lang.ArithmeticException;

public class File21CustomException {
    public static void main(String[] args) {
        var age = 17;

        if (age < 18) {
            throw new ArithmeticException("You must be atleast 18 years old!");

        }
        else {
            IO.println("You are old enough!");
        }
    }
}