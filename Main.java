import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IO.println("Enter your name! -> ");

        String myName = input.nextLine();

        IO.println("Your name is: -> " + myName);

        IO.println("Enter your age ->");

        int myAge = input.nextInt();

        IO.println("Your age is: -> " + myAge);

        Integer x = 100;
        IO.println(x.size);

        input.close();
    }
}