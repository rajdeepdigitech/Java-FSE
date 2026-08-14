/*


4. Leap Year Checker 
• Objective: Apply nested conditional logic. 
• Task: Check if a given year is a leap year. 
• Instructions: 
o Prompt the user to enter a year. 
o A year is a leap year if it's divisible by 4 but not by 100, unless it's also divisible by 400. 
o Display the result accordingly. 


*/



package CoreJava;

import java.util.Scanner;
import java.lang.IO;

public class File04leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // <type> <variable> = ..
        IO.println("Enter any year: ");
        int userInput = input.nextInt();
        if ((userInput % 4 == 0 && userInput % 100 != 0) || (userInput % 400 == 0)) {
            IO.println("This is a leap year!");
        } else {
            IO.println("Not a leap year!");
        }

        input.close();


    }    
}
