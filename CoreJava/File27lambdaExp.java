/*
27. Lambda Expressions 
• Objective: Use functional programming features. 
• Task: Sort a list of strings using a lambda expression. 
• Instructions: 
o Create a List of strings. 
o Use Collections.sort() with a lambda to sort the list. 
o Display the sorted list. 

*/

/*
    parameter -> expression
    (parameter1, parameter2) -> expression
    (parameter1, parameter2) -> {
        return result;
    } 

    Need to look up on lambda function as well

*/

package CoreJava;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.Collections;

public class File27lambdaExp {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(5);


        // Sort the list using lambda
        Collections.sort(numbers, (n1, n2) -> n1 - n2);


        // Built-in functional interfaces
        Consumer<Integer> method = (n) -> {IO.println(n);};
        numbers.forEach(method);
    }

    
}
