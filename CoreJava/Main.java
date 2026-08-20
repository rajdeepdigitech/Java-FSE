package CoreJava;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean P = true; // 1 
        boolean Q = false; // 0

        // AND -> &&

        // IO.println("Output");
        // IO.println(P&&Q);


        // OR -> ||

        // IO.println("Output");
        // IO.println(P||Q);

        // NOT -> !

        // IO.println("Output");
        // IO.println(!P);

        // -5 < x < 5

        IO.println("Input val of x: -> ");
        int x = input.nextInt();

        // if (x >= -5 && x <= 5) 
        //     IO.println("x lies between -5 & 5.");
        // else 
        //     IO.println("Beyond suggested range!");

        // <type> <variable> = <condition> ? <outputOne> : <outputTwo>;
        // <print> <variable>

        boolean y = x >= -5 && x <= 5 ? true : false;
        IO.println(y) ;

        input.close();
        
    }
}