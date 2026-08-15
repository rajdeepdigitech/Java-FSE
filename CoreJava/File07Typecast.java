/*

7. Type Casting Example 
• Objective: Practice type casting between different data types. 
• Task: Convert a double to an int and vice versa. 
• Instructions: 
o Declare a double variable with a decimal value. 
o Cast it to an int and display the result. 
o Declare an int variable and cast it to a double, then display. 


*/


package CoreJava;

import java.lang.IO;

public class File07Typecast {
    public static void main(String[] args) {

        double myDouble = 8.98d;
        int myInt = (int) myDouble; // Output 8
        IO.println("My number -> " + myInt);
        myDouble = (double) myInt; // Output 8.0s
        IO.println("My number -> " + myDouble);
        char myChar = 'A';
        myInt = (int) myChar;
        IO.println("My number -> " + myInt);
        // var myNumber = 0;
        // boolean myBool = (boolean) myNumber;
        // Java doesn't allow typecasting from int to a boolean


    }

}