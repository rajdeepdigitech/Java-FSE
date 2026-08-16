/*

21. Custom Exception 
• Objective: Create and use custom exceptions. 
• Task: Define a custom exception InvalidAgeException. 
• Instructions: 
o Throw InvalidAgeException if the user's age is less than 18. 
o Catch the exception and display a message. 

*/

// Need to study this again! - 
// AI GENERATED

package CoreJava;

public class File21CustomException {
    /**
     * NESTED CLASS DOCUMENTATION:
     * InvalidAgeException is a nested class (inner class) defined inside File21CustomException.
     * 
     * WHAT IS A NESTED CLASS?
     * A nested class is a class defined inside another class. In this case, InvalidAgeException
     * is defined within File21CustomException's scope.
     * 
     * WHY USE NESTED CLASSES?
     * 1. LOGICAL GROUPING: InvalidAgeException is logically related to File21CustomException
     *    and only used within this context. Grouping them shows this relationship.
     * 
     * 2. ENCAPSULATION: The nested class is hidden from the outside world. Only File21CustomException
     *    knows about it. This prevents unintended usage or modification from other classes.
     * 
     * 3. CODE ORGANIZATION: Keeps related classes together, making code cleaner and more organized.
     * 
     * 4. ACCESS TO OUTER CLASS MEMBERS: A non-static nested class can access private members
     *    of the outer class (though static nested classes cannot).
     * 
     * 5. CUSTOM EXCEPTIONS: Creating custom exceptions as nested classes is common when the
     *    exception is specific to a particular class or module.
     * 
     * TYPES OF NESTED CLASSES:
     * - Static Nested Classes: Declared with 'static' keyword. Cannot directly access instance
     *   members of outer class. Used when the nested class doesn't need outer class instance.
     * - Non-static Nested Classes (Inner Classes): Can access all members of outer class.
     * 
     * In this code:
     * static class InvalidAgeException extends Exception { ... }
     *                                                    ^^^
     * This is a STATIC NESTED CLASS because of the 'static' keyword.
     * 
     * EXAMPLE OF WHEN TO USE NESTED CLASSES:
     * - Custom exceptions for specific use cases (like here)
     * - Adapter classes that convert interfaces
     * - Event listeners and callbacks
     * - Utility classes related to a specific outer class
     * - Comparator implementations
     */
    static class InvalidAgeException extends Exception {
        /**
         * Constructor for InvalidAgeException
         * 
         * @param message The error message to be displayed when exception is thrown
         * 
         * The super(message) call invokes the parent Exception class constructor,
         * passing the error message to be stored in the exception object.
         * This allows the exception to carry meaningful information about what went wrong.
         * When caught, getMessage() can retrieve this message for display or logging.
         */


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