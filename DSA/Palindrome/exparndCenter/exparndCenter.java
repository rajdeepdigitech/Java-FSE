package DSA.Palindrome.exparndCenter;

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
