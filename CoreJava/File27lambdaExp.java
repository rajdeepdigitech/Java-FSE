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
        // Collections.sort(List<T> list, Comparator<? super T> c) is a static method
        // that rearranges the elements of the list in ascending order according to the
        // comparator provided as the second argument.
        //
        // Here, the lambda expression:
        //     (n1, n2) -> n1 - n2
        // is treated as the Comparator<Integer> implementation.
        //
        // In Java, a Comparator compares two elements and returns:
        //     negative value  -> n1 should come before n2
        //     zero            -> both elements are considered equal
        //     positive value  -> n1 should come after n2
        //
        // For example:
        //     if n1 = 5 and n2 = 7, then 5 - 7 = -2, so 5 is placed before 7.
        //     if n1 = 8 and n2 = 5, then 8 - 5 = 3, so 8 is placed after 5.
        //
        // The sort() method internally calls this lambda repeatedly during sorting,
        // comparing pairs of elements until the entire list is ordered correctly.
        Collections.sort(numbers, (n1, n2) -> n1 - n2);

        // Built-in functional interfaces
        Consumer<Integer> method = (n) -> {IO.println(n);};
        numbers.forEach(method);
    }

    
}
