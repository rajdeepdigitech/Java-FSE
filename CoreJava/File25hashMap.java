/*

25. HashMap Example 
• Objective: Use key-value pairs. 
• Task: Map student IDs to names. 
• Instructions: 
o Create a HashMap with Integer keys and String values. 
o Allow the user to add entries. 
o Retrieve and display a name based on an entered ID. 


*/


package CoreJava;

import java.util.HashMap;
import java.util.Scanner;

public class File25hashMap {
    public static void main(String[] args) {
        // Old code kept as comment for reference
        // HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        var myHashMap = new HashMap<Integer, String>();
        Scanner input = new Scanner(System.in);
        IO.println("Enter a keyvalue, then a name: -> ");
        for (int i = 0; i < 5; i++) {
            IO.println("Add Id: ");
            int Id = input.nextInt();
            input.nextLine();
            IO.println("Add name: ");
            String name = input.nextLine();
            myHashMap.put(Id, name);
        }

        // for (Integer i : myHashMap.keySet()) {
        //     IO.println("Key: " + i + " value: " + myHashMap.get(i));
        // }

        int myKey = input.nextInt();
        IO.println("Enter the Id you want to search: ");

        IO.println(myHashMap.get(myKey));



        input.close();

    }
}
