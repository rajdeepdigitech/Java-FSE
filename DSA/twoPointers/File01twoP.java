/*

Given a sorted array A (sorted in ascending order), having N integers, 
find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.
how many pairs?

*/

package DSA.twoPointers;

import java.lang.IO;
import java.util.*;

class twoPointers {
    public boolean solution(int[] arr, int Sum, int arrLength) {

        Arrays.sort(arr);

        for (int i = 0; i < arrLength; i++) {
            for (int j = 1; j < arrLength; j++) {
                int sumOfElements = arr[i] + arr[j];
                if (sumOfElements == Sum) {
                    return true;
                }
            }

        }

        return false;

        
    }
    public int solution(int[] arr, int Sum) {

        Arrays.sort(arr);

        int frequency = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int sumOfElements = arr[i] + arr[j];
                if (i <= j) {
                    if (sumOfElements == Sum) {
                        frequency++;
                    }
                }
                
            }

        }

        return frequency;

        
    }

    public int absoluteSolution (int[] arr, int Sum) {
        
        int left = 0;
        int right = arr.length - 1;
        int frequency = 0;
        Arrays.sort(arr);

        int mid = (left + right)/2;
            if ((2 * arr[mid]) == Sum) {
                frequency++;
            }
        while(left < right) {
            
            
            if (arr[left] + arr[right] == Sum) {
                frequency++;
            }
            
            left++;
            right--;
        }
        
        return frequency;
    }
}


public class File01twoP extends twoPointers {
    public static void main(String[] args) {
        int arr[] = {8,7,9,4,3,5,2,1,0};

        twoPointers myObj = new twoPointers();
        IO.println(myObj.solution(arr, 6, 9));
        IO.println(myObj.solution(arr, 6)); // returns 5 
        IO.println(myObj.solution(arr, 6));

        
    }
}
