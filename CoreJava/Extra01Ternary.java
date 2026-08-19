package CoreJava;

import java.lang.IO;

public class Extra01Ternary {
    public static void main(String[] args) {
        int myNumber = 4;
        

        // if (myNumber % 2 == 0) {
        //     myResult = 20;
        // }
        // else {
        //     myResult = -10;
        // }

        // Ternary Operator 
        int myResult = myNumber % 2 == 0 ? 10 : 20;

        IO.println(myResult);
    }
}