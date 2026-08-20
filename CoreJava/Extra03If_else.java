package CoreJava;

import java.lang.IO;
import java.util.Scanner;

public class Extra03If_else {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int myAge = input.nextInt();

        if (myAge > 18) {
            IO.println("You are eligible!");
        }
        else if (myAge < 18) {
            IO.println("You are not eligible!");
        }
        else {
            IO.println("Please enter a number!");
        }

        input.close();
    }   
}

