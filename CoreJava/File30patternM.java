/*

30. Pattern Matching for switch (Java 21) 
• Objective: Simplify conditional logic with pattern matching in enhanced switch expressions. 
• Task: Determine the type of an object and respond accordingly. 
• Instructions: 
o Create a method that accepts Object as input. 
o Use a switch expression to check if the object is Integer, String, Double, etc. 
o Print a message based on the object’s type. 

*/

package CoreJava;

import java.util.List;

public class File30patternM {
    public static void main(String[] args) {
        List<Object> list = List.of(1, "Hello", 3.14, 'a');
        list.forEach(obj -> {
            String result = switch (obj) {
                case Integer i -> "Integer: " + i;
                case String s -> "String: " + s;
                case Double d -> "Double: " + d;
                case Character c -> "Character: " + c;
                default -> "Unknown type";
            };
            System.out.println(result);
        });
    }
}