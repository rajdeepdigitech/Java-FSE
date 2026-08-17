/*

28. Stream API 
• Objective: Process collections using streams. 
• Task: Filter and display even numbers from a list. 
• Instructions: 
o Create a List of integers. 
o Use the Stream API to filter even numbers. 
o Collect and display the result. 

*/

// AI generated

package CoreJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class File28steamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);
    }
    
}
    
