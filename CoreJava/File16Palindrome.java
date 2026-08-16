/*

16. Palindrome Checker 
• Objective: Combine string manipulation and conditional logic. 
• Task: Check if a string is a palindrome. 
• Instructions: 
o Prompt the user for a string. 
o Remove any non-alphanumeric characters and convert to lowercase. 
o Check if the string reads the same forwards and backwards. 
o Display the result.


*/

package CoreJava;

import java.lang.IO;
import java.util.Scanner;

public class File16Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IO.println("Please enter a string: -> ");
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();
        IO.println(userInput);

        char[] userInputToCharArr = userInput.toCharArray();
        int right = userInputToCharArr.length - 1;
        int left = 0;
        boolean isPalindrome = false;

        while (left < right) {
            
            if (userInputToCharArr[left] == userInputToCharArr[right]) {
                isPalindrome = true;
                left++;
                right--;
                IO.println("Is a palindrome!");
            }
            else {
                IO.println("Not a palindrome!");
                break;
            }
        }

        



        input.close();


    }


}
