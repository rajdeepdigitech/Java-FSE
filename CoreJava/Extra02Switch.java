package CoreJava;

import java.lang.IO;
import java.util.Scanner;

public class Extra02Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IO.println("Please enter a number: ");
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                IO.println("Monday!");
                break;
            case 2:
                IO.println("Tuesday!");
                break;
            case 3:
                IO.println("Wednesday!");
                break;
            case 4:
                IO.println("Thursday!");
                break;
            case 5:
                IO.println("Friday!");
                break;
            case 6:
                IO.println("Saturday!");
                break;
            case 7:
                IO.println("Sunday!");
                break;
            default:
                IO.println("Enter a number between 1-7 only");
                break;
        }

        input.close();

    }
}
