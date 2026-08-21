/*

5. Longest Palindromic Substring
Attempted
Medium
Topics
premium lock icon
Companies
Hint
Given a string , return the longests palindromic substring in .s

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

*/


package DSA.twoPointers;

import java.util.*;
import java.util.stream.Collectors;

public class File02palindrome {

    public static void main(String[] args) {
        var character = new Stack<>();
        String s = "babad"; // Odd 

        char[] arr = s.toCharArray();

        int lowerBound = 0;
        int upperBound = arr.length - 1;
        int mid = ((lowerBound + upperBound) / 2);
        int it = mid + 1;

        

        character.push(arr[mid]);
        
        for (int i = mid - 1; i >= 0; i-- ) {

            if (arr[i] == arr[it]) {
                character.push(arr[it]);
                character.push(arr[it]);
            }
            it++;

        }

        String output = character.stream().map(String::valueOf).collect(Collectors.joining());
        IO.println(output);

    }
    
}
