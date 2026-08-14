/*

6. Data Type Demonstration 
• Objective: Understand Java's primitive data types. 
• Task: Declare variables of different primitive types and display their values. 
• Instructions: 
o Declare variables of types int, float, double, char, and boolean. 
o Assign appropriate values to each. 
o Use System.out.println() to display each variable. 

*/


package CoreJava;

import java.lang.IO;

public class File06Dattypes {
    
    public static void main(String[] args) {
        int myInt = 25;
        float myFloat = 2.5f;
        double myDouble = 532.34d;
        char myCharacter = 'X';
        boolean myBool = false;

        IO.println(myInt);
        IO.println(myFloat);
        IO.println(myDouble);
        IO.println(myCharacter);
        IO.println(myBool);
    }

}
