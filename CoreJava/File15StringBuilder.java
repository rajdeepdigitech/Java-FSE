/*

15. String Reversal 

• Objective: Manipulate strings. 
• Task: Reverse a string entered by the user. 
• Instructions: 
o Prompt the user for a string. 
o Use a loop or StringBuilder to reverse the string. 
o Display the reversed string.


*/




package CoreJava;

import java.util.Scanner;

public class File15StringBuilder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        IO.println("Please enter the string you want to write: ");
        String myName = input.nextLine();

        IO.println("Your entered input is: " + myName);

        // char[] myString = myName.toCharArray();
        // int index = 0;
        // char[] reverseString = new char[myString.length];
        //
        // for (int i = myString.length - 1; i >= 0; i--) {
        //     reverseString[index] = myString[i];
        //     index++;
        // }
        // String reverseName = reverseString.toString();

        StringBuilder reverseString = new StringBuilder(myName);
        String reverseName = reverseString.reverse().toString();

        IO.println("Here is your required output! -> " + reverseName);

        input.close();


    }

}