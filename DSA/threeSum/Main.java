package DSA.threeSum;

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