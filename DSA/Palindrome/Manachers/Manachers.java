package DSA.Palindrome.Manachers;

import java.lang.StringBuilder;

class Solution {
    public String longestPalindrome(String s) {
        
        // Check whether String is empty or not!
        String best = "xx";

        if (s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder("^");
        // The idea is to place a special character '^' at the beginning and end of the string.
        // This is done to avoid the problem of odd length palindromes.
        // For example, if the string is "abc", the converted string will be "^a^b^c^".
        // By placing the '^' characters at the beginning and end, we can ensure that all substrings
        // of the converted string are centered around a '^' character. This makes it easier to
        // find the longest palindromic substring.
        
        for (char c : s.toCharArray()) {
            sb.append('#').append(c);
        }

        sb.append('#');

        String t = sb.toString();
        int n = t.length();
        int[] P = new int[n];
        int C = 0, R = 0;
        





        return best;


        
    }
}

public class Manachers {
    public static void main(String[] args) {

        String s = "Rahul";
        IO.println(s.length());

        StringBuilder sb = new StringBuilder("");

        char[] arr = s.toCharArray();

        for (char c : arr) {
            // sb.append("#").append(c);
            IO.println(c);
        }
        sb.append("#");
        
        String t = sb.toString();

        IO.println(t);

    }
    
}
