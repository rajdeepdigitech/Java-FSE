package DSA.threeSum;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;

//         List<List<Integer>> List_arr = new ArrayList<List<Integer>>();
//         Set<Integer> arr = new HashSet<Integer>();
//         List<Integer> newarr; 
//         Arrays.sort(nums);
//         int left = 0;
//         int right = n - 1;

//         while (left < right) {
//             // Keeping the right fixed, varying the left & second val
//             for (int i = left; i < right - 2; i++) {
//                 for (int j = left + 1; j < right - 1; j++ ) {
//                     if (nums[i] + nums[j] + nums[right] == 0 ) {
//                         arr.add(nums[i]);
//                         arr.add(nums[j]);
//                         arr.add(nums[right]);
//                         newarr = new ArrayList<Integer>(arr);
//                         List_arr.add(newarr);
//                     }

//                 }
//             }
//             for (int i = right; i > left + 2; i--) {
//                 for (int j = right - 1; j > left - 1; j-- ) {
//                     if (nums[i] + nums[j] + nums[right] == 0 ) {
//                         arr.add(nums[i]);
//                         arr.add(nums[j]);
//                         arr.add(nums[right]);
//                         newarr = new ArrayList<Integer>(arr);
//                         List_arr.add(newarr);
//                     }

//                 }
//             }
//             left++;
//             right--;

//         }
//         return List_arr;




//         /** 
//             1 2 3 4 5 6

//             1 2 6     1 2 5  
//             1 3 6     1 3 5
//             1 4 6     1 4 5
//             1 5 6

//             1 2 5     1 2 4 
//             1 3 5     1 3 4
//             1 4 5     1 2 3

//             1 2 4 
//             1 3 4

//             1 2 3            


//         */




        
//     }
// }

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> finalarr = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Two pointers 
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> arr = new ArrayList<Integer>();
                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);

                    boolean exists = finalarr.contains(arr);
                    if(exists) {
                        finalarr.remove(arr);
                    }

                    finalarr.add(arr);

                    // Claude

                    // while (left < right && nums[left] == nums[left + 1]) {
                    //     left++;
                    // }
                    // // Skip duplicates at right
                    //  while (left < right && nums[right] == nums[right - 1]) {
                    //     right--;
                    // }


                } 

                left++;
                right--;
            }
        }
        return finalarr;
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}