package DSA.Palindrome;

class Solution {

    private boolean isPalindrome(String s, int l, int r) {
        while(l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        String bestPalindrome = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((j - i + 1) > bestPalindrome.length() && isPalindrome(s, i, j)) {
                    // Update the bestPalindrome variable with the current longest palindrome.
                    // The new palindrome is obtained by calling the substring method on the
                    // original string s, passing the starting index i and ending index j+1.
                    // This ensures that the substring includes the character at index j+1.
                    // bestPalindrome = s.substring(i, j + 1);
                    
                    bestPalindrome.substring(i, j + 1);
                }
            }
        }
        return bestPalindrome;
    }

}

public class Main {
    
}
