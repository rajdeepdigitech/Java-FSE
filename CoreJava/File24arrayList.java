/*

24. ArrayList Example 
• Objective: Use dynamic arrays. 
• Task: Manage a list of student names. 
• Instructions: 
o Create an ArrayList to store names. 
o Allow the user to add names to the list. 
o Display all names entered.

*/

package CoreJava;

import java.util.*;
import java.lang.IO;

public class File24arrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> myArr = new ArrayList<String>();
        IO.println("Please enter 5 names: -> ");
        for (int i = 0; i < 5; i++) {
            String name = input.nextLine();
            myArr.add(name);
        }

        IO.println("<-- OUTPUT -->");
        for (String s : myArr) {
            IO.println(s);
        }
 
        input.close();
    }
}