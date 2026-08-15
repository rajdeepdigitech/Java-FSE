/*

14. Array Sum and Average 
• Objective: Work with arrays and perform calculations. 
• Task: Calculate the sum and average of elements in an array. 
• Instructions: 
o Prompt the user to enter the number of elements. 
o Read the elements into an array. 
o Calculate and display the sum and average. 


*/


package CoreJava;

import java.lang.IO;
import java.util.Scanner;

public class File14ArrSumAndAvg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int arr[] = new int[5];
        int arrayLength = arr.length;

        IO.println("Enter the numbers: ");
        int userInput = 0;
        int sum = 0;
        int avgSum = 0;

        for (int i = 0; i < arrayLength; i++) {
            
            // if (i == arrayLength) {
            //     break;
            // }
            userInput = input.nextInt();
            
            arr[i] = userInput;
            sum = sum + userInput;
            

        }
        IO.println("The array is: ");
        for (int element : arr) {
            IO.print(element + " ");
        }
        IO.println("\n");
        IO.println("The sum of all the elements -> " + sum);

        avgSum = sum / arr.length;

        IO.println("The avg of all the elements -> " + avgSum);

        
        input.close();
    }
}
