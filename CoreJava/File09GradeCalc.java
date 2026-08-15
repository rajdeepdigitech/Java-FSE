/*
9. Grade Calculator 
• Objective: Use conditional statements to determine grades. 
• Task: Assign grades based on marks entered by the user. 
• Instructions: 
o Prompt the user for marks out of 100. 
o Use if-else statements to assign grades: 
▪ 90-100: A 
▪ 80-89: B 
▪ 70-79: C 
▪ 60-69: D 
▪ Below 60: F 
o Display the assigned grade. 


*/

package CoreJava;

import java.lang.IO;
import java.util.Scanner;


public class File09GradeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IO.println("Write your acquired marks -> ");
        int userInput = input.nextInt();

        if (userInput < 60) {
            IO.println("Grade -> F");
        }
        else if (userInput <= 69) {
            IO.println("Grade -> D");
        }
        else if (userInput <= 79) {
            IO.println("Grade -> C");
        }
        else if (userInput <= 89) {
            IO.println("Grade -> B");
        }
        else if (userInput <= 100) {
            IO.println("Grade -> A");
        }
        else {
            IO.println("You should quit your studies already!");
        }


        input.close();
    }
}
