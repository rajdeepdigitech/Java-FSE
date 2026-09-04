package DSA.serveCustomers;

import java.util.Arrays;

class Solution {
    public int serveCustomers(int[] arr, int[] custarr) {
        Arrays.sort(arr);
        Arrays.sort(custarr);

        int customersServed = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < custarr.length; j++) {
                if (arr[i] == custarr[j]) {
                    arr[i] -= custarr[j];
                    custarr[j] = arr[i];
                    break;
                    
                }
                else {
                    if (arr[i] < custarr[j]) {
                        custarr[j] -= arr[i];
                        arr[i] = 0;
                        if (custarr[j] < arr[i+1]) {
                            arr[i+1] -= custarr[j];
                            custarr[j] = 0;
                        }
                    }
                    else if (arr[i] > custarr[j]) {
                        arr[i] -= custarr[j];
                        custarr[j] = 0;
                    }
                    
                }
                if (custarr[j] == 0) {
                    customersServed++;
                }
            }
            

        }


        return customersServed;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] array = {5,10,8,6};
        int[] customerDemands = {7, 5, 12};
        IO.println(sol.serveCustomers(array, customerDemands));


    }
    
}
