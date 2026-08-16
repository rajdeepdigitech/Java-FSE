package GFG;

import java.lang.IO;


/*

Logic -> 

{1,2,3} -> {1,2}, {1,3}, {2,3}, {1,2,3}

for loop (1) -> 1     2     3
                ^
for loop (2) -> 1     2     3
                      ^

*/

class Solution {
    public int minProd(int[] arr) {
        
        // int minProduct = Integer.MAX_VALUE;
        int checkProduct = 1;
        int baseCase = 1;
        int tempCase = 1;
        int frequency = 0;
        
        // (0) Frequency of negative numbers in the array 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                frequency++;
            }
        }
        
        if (frequency % 2 == 0) {
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    continue;
                }
                if (tempCase < baseCase) {
                    baseCase = tempCase;
                    continue;
                }
                tempCase = arr[i] * baseCase;
            }
            
        } 
        else if (frequency % 2 == 1) {
            // (1) Max product of all numbers 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            checkProduct *= arr[i];
            // checkProduct = checkProduct * arr[i];
            
        }
        
        }
            
        
        
        
        
        
        // (2) Comparing individual elements to Max Product
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < checkProduct) {
                checkProduct = arr[i];
            }
            
        }
        
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         int checkProduct = arr[i] * arr[j];
        //         if (checkProduct < minProduct) {
        //             minProduct = checkProduct;
        //         }
        //     }
        // }

        if (baseCase < checkProduct) {
            checkProduct = baseCase;
        }
        return checkProduct;
        
        
    }
}

public class File160826 {
    
}


