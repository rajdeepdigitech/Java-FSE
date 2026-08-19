package CoreJava;

import java.lang.IO;
import java.util.*;

public class Extra01Ternary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        IO.println("Enter your age: ->");

        int myAge = input.nextInt();

        int myNumber = 4;
        

        // if (myNumber % 2 == 0) {
        //     myResult = 20;
        // }
        // else {
        //     myResult = -10;
        // }

        // Ternary Operator 
        // int myResult = myNumber % 2 == 0 ? 10 : 20;

        boolean myResult = myAge % 2 == 0 ? true : false;

   

        input.close();
    }
}