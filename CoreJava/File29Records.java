/*

29. Records 
• Objective: Use the record keyword for immutable data structures (Java 16+). 
• Task: Create a record to represent a Person with name and age. 
• Instructions: 
o Define a record named Person. 
o Create instances and print them. 
o Use records in a List and filter based on age using Streams.

*/

package CoreJava;

import java.util.List;

record Person(String name, int age) {}

public class File29Records {

    public static void main(String[] args) {
        var p1 = new Person("Alice", 25);
        var p2 = new Person("Bob", 30);
        var people = List.of(p1, p2);

        people.stream()
                .filter(p -> p.age() > 28)
                .forEach(System.out::println);
    }



    
}
