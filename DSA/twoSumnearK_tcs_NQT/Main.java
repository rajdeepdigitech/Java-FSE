package DSA.twoSumnearK_tcs_NQT;

import java.util.*;

class Solution {
    /**
     * Given a sorted array of integers and a target value k,
     * find the pair whose sum is closest to k.
     *
     * Tie-breaking rules (when multiple pairs share the same minimum
     * difference from k):
     *   1. Prefer the pair with the smaller first element.
     *   2. If first elements are equal, prefer the pair with the smaller
     *      second element.
     *
     * @param arr sorted array of integers (may contain duplicates,
     *            positives, and/or negatives)
     * @param k   target sum
     * @return    int array of size 2: [smaller number, larger number]
     *            of the closest pair
     */
    public int[] closestPair(int[] arr, int k) {
        // TODO: implement

        


        return new int[0];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test 1: Basic case — a single, unambiguous closest pair
        // Expected: [4, 10]
        runTest(sol, new int[]{1, 3, 4, 7, 10}, 15, "Basic case");

        // Test 2: Tie-break — two pairs equidistant from k, must pick
        // the one with the smaller first element
        // Expected: [2, 6]
        runTest(sol, new int[]{1, 2, 3, 4, 5, 6}, 8, "Tie-break (positive)");

        // Test 3: Negative numbers, several pairs tied on distance from k
        // Expected: [-8, 9]
        runTest(sol, new int[]{-8, -4, -2, 1, 3, 5, 9}, 0, "Negative numbers + tie-break");

        // Test 4: k smaller than every possible pair sum
        // Expected: [10, 20]
        runTest(sol, new int[]{10, 20, 30, 40}, 5, "k below range");

        // Test 5: k larger than every possible pair sum
        // Expected: [30, 40]
        runTest(sol, new int[]{10, 20, 30, 40}, 1000, "k above range");

        // Test 6: all duplicate values
        // Expected: [2, 2]
        runTest(sol, new int[]{2, 2, 2, 2}, 4, "Duplicates");

        // Test 7: minimal array — exactly 2 elements
        // Expected: [5, 9]
        runTest(sol, new int[]{5, 9}, 100, "Minimal array (n = 2)");
    }

    private static void runTest(Solution sol, int[] arr, int k, String label) {
        int[] result = sol.closestPair(arr, k);
        System.out.println(label + " -> arr=" + Arrays.toString(arr)
                + ", k=" + k + " => " + Arrays.toString(result));
    }
}