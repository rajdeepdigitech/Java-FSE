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

/*
    Longest Palindromic Substring 
    Multiple Palindromic Queries

    abba cdc dabd
    sol -> abba, cdc 
 */


package DSA.Palindrome;

class Solution {
    private boolean isPalindrome(String s, int left, int right) {

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        String best = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // This condition is to ensure that the current substring is
                // longer than the current best substring. If it is not, we
                // can skip the rest of the loop because we already have a
                // longer substring.
                if ((j - i + 1) > best.length() && isPalindrome(s, i, j)) {
                    best = s.substring(i, j+1);
                }
            }
        }
        return best;
    }
}


public class File02palindrome {
    public static void main(String[] args) {
        

    }
}