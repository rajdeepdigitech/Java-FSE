/*

22. File Writing 
• Objective: Write data to a file. 
• Task: Write user input to a text file. 
• Instructions: 
o Prompt the user for a string. 
o Write the string to a file named output.txt. 
o Confirm that the data has been written. 


*/

package CoreJava;

import java.util.Scanner;
import java.lang.IO;
import java.io.File;
import java.io.IOException;

public class File22FileHandling {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        try {
            IO.println("Enter a string of your choice: -> ");
            String userInput = input.nextLine();

            File myObj = new File("output.txt");
            if (myObj.createNewFile()) {
                IO.println("File created " + myObj.getName());
            }
            else {
                IO.println("File already exists");
            }
        } 
        catch (IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }



        input.close();
    }
}

