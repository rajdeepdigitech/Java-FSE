/*

21. Custom Exception 
• Objective: Create and use custom exceptions. 
• Task: Define a custom exception InvalidAgeException. 
• Instructions: 
o Throw InvalidAgeException if the user's age is less than 18. 
o Catch the exception and display a message. 

*/

// Need to study this again!

package CoreJava;

public class File21CustomException {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        int age = 17;

        try {
            if (age < 18) {
                throw new InvalidAgeException("You must be at least 18 years old!");
            }
            System.out.println("You are old enough!");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}