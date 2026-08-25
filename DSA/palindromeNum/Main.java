package DSA.palindromeNum;

import java.lang.IO;
import java.lang.Math;

class Solution {
    
    public boolean isPalindrome(int x) {
        int digits = 0;
        int remainder = 0;
        int quotient = 0;
        int reversedNumber = 0;
        if (x < 0) {
            return false;
        }
        else {
        if (x>= 0 && x < 10) {
            return true; // single digit input
        } 
        else {
        
        int num = x; // save x
        int temp = x; // save x
        while(num != 0) {
            num /= 10;
            digits++; // 3
            // num got destroyed here!
            // O(n)
        }

        for (int i = digits; i > 0; i--) {
            // 0 1 2
            // extractedDigits = x / (int) Math.pow(10,i); // flawed logic
            
            
            if (temp < 10) {
                reversedNumber += temp;
                break;
            }

            remainder = temp % 10;
            reversedNumber += remainder * Math.pow(10, i - 1); // 100
           
            if (quotient < 0) {
                return false;
                
            } else {
                 quotient = temp/10; // 12
                 temp = quotient;
            }
            
            
        }
        if (reversedNumber == x) {
            return true;
        }

        return false;
    }
    }
}
}

public class Main extends Solution {
    public static void main(String[] args) {
        Solution ob = new Solution();
        boolean output = ob.isPalindrome(-121);
        boolean outputTwo = ob.isPalindrome(11);
        IO.println(output);
        IO.println(outputTwo);

        
    }  
}
