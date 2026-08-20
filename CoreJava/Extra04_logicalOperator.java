/*
    ~ Logical AND
    * Bitwise AND -> &
    * Short-Circuit -> &&
    
    ~ Logical OR 
    * Bitwise OR -> | 
    * Short-Circuit OR -> ||
    
    ~ Logical NOT (!)
    * Invert -> ! 

    ~ Logical XOR (^)

*/

package CoreJava;

import java.util.Scanner;
import java.lang.IO;

public class Extra04_logicalOperator {
    public static void main(String[] args) {
        int x = 7, y = 8, a = 5, b = 0;

        // AND operation

        boolean andResult = (x > y) && (a < b);
        IO.println("AND Result: " + andResult); // Output: true

        // OR operation 

        boolean orResult = (x > y) || (a > b);
        IO.println("OR Result: " + orResult);

        // NOT operation 

        boolean notResult = !(x < y);
        IO.println("NOT Result: " + notResult);



    }
}
