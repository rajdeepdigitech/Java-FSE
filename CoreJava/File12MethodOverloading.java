/*

12. Method Overloading 
• Objective: Understand method overloading in Java. 
• Task: Create multiple methods with the same name but different parameters. 
• Instructions: 
o Define methods named add that accept: 
▪ Two integers. 
▪ Two doubles. 
▪ Three integers. 
o Each method should return the sum of its parameters. 
o Call each method and display the results.



*/


package CoreJava;

import java.lang.IO;

public class File12MethodOverloading {

    static int myMethod(int a, int b) {
        IO.println("The first method was called!");
        return a + b;
    }
    static double myMethod(double a, double b) {
        IO.println("The second method was called!");
        return a + b;
    }
    static int myMethod(int a, int b, int c) {
        IO.println("The third method was called!");
        return a + b + c;
    }

    public static void main(String[] args) {
        int result = myMethod(6, 7);
        IO.println(result);
        double resultDouble = myMethod(6.7, 6.9);
        IO.println(resultDouble);
        result = myMethod(4, 2, 0);
        IO.println(result);
    }
}