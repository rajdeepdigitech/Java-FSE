package DSA.longestCommonPrefix;
import java.lang.IO;
class Solution {
    public String longestCommonPrefix(String[] strs) {

        
        
        // strs -> An array of strings 
        
        int n = strs.length;
        String minString = "";
        String outPut = "";
        int minStringLength = Integer.MAX_VALUE;
        StringBuilder result;

        for (int i = 0; i < n; i++) {
            if (strs[i].length() < minStringLength) {
                minStringLength = strs[i].length();
                minString = strs[i];
                // Gives us the minimum length of the shortest string
                // & the shortest string 
            }
        }

        if (minStringLength == 0) {
            return "";
        }
        else {
        result = new StringBuilder(minString);

        
        for (int i = 0; i < n; i++) {
            if (minString.charAt(0) != strs[i].charAt(0)) {
            return "";
            } else {
            for (int j = 0; j < minStringLength; j++) {
                char c = strs[i].charAt(j);
                if (c != minString.charAt(j)) {
                    result.delete(j, Integer.MAX_VALUE);
                    break;
                }
                
            }
        }
            outPut = result.toString();
            
        }

        
        

        return outPut;
    }
}}


public class Main {
    public static void main(String[] args) {
          
        Solution sol = new Solution();
        String arr[] = {"flower", "flow", "flight"};
        IO.println(sol.longestCommonPrefix(arr));
       
        

    }
}
