package DSA.Palindrome.exparndCenter;

/**
 * The 'expand' method is used to expand around a center 'i' in a string 's' from both sides.
 * It first checks if the character at index 'l' and 'r' are equal to each other.
 * If they are equal, it decreases 'l' by 1 and increases 'r' by 1.
 * If they are not equal, the method stops and returns as the current length of the palindrome is greater than previous one.
 * The method also calculates the length of the palindrome and updates the 'start' and 'maxLen' if the current length is greater than the previous one.
 * 
 * @param s The string to expand around.
 * @param l The left index of the string.
 * @param r The right index of the string.
 */


/**
 * The 'longestPalindrome' method is used to find the longest palindrome in a given string 's'.
 * It first checks the length of the string and if it is 0, it returns an empty string.
 * If the string is not empty, it initializes the 'start' and 'maxLen' as 0 and 1 respectively.
 * Then, it iterates over the indices of the string 's'.
 * For each index, it calls the 'expand' method to expand around index 'i' and 'i+1'.
 * The 'expand' method expands around a center 'i' in the string 's' from both sides.
 * If the length of the current palindrome is greater than the previous one, it updates the 'start' and 'maxLen' accordingly.
 * Finally, it returns the substring of the original string 's' starting from 'start' and length 'maxLen'.
 * 
 * @param s The string to find the longest palindrome in.
 * @return The longest palindrome in the given string.
 */



class Solution {
    private int start, maxLen;

    private void expand(String s, int l, int r) {
        int n = s.length();
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        int len = r - l - 1; // ?
        if (len > maxLen) {maxLen = len; start = l + 1;}

    }


    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";
        start = 0; maxLen = 1;
        for (int i = 0; i  < n; i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }
        return s.substring(start, start + maxLen);
    }
}

public class exparndCenter {
    public static void main(String[] args) {

    }
}
