package DSA.romanToInt;

class Solution {
    public int romanToInt(String s) {
        // Symbols I, V, X, L, C, D, M
        int val = 0;
        char[] arr = s.toCharArray();
        char[] checker = new char[arr.length + 2];
        checker[0] = '\0';
        checker[arr.length + 1] = '\0';


        for (int i = 0; i < arr.length; i++) {
            checker[i + 1] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            
            
            if (arr[i] == 'I') {
                if (checker[i + 2] == 'V')
                    val += 0;
                else if (checker[i + 2] == 'X')
                    val += 0;
                else 
                    val+=1;
            }
            else if (arr[i] == 'V') { 
                if (checker[i] == 'I')
                    val += 4;
                else
                    val += 5;
            }
            else if (arr[i] == 'X') {
                if (checker[i] == 'I')
                    val += 9;
                else if (checker[i+2] == 'L')
                    val+= 0;
                else if (checker[i + 2] == 'C')
                    val += 0;
                else 
                    val += 10;
            }
            else if (arr[i] == 'L') {
                if (checker[i] == 'X') 
                    val += 40;
                else
                    val += 50;
            }
            else if (arr[i] == 'C') {
                if (checker[i] == 'X')
                    val += 90;
                else if (checker[i + 2] == 'D')
                    val += 0;
                else if (checker[i + 2] == 'M')
                    val += 0;
                else 
                    val += 100;
            }
            else if (arr[i] == 'D') {
                if (checker[i] == 'C')
                    val+= 400;
                else 
                    val += 500;
            }
            else if (arr[i] == 'M') {
                if (checker[i] == 'C')
                    val+= 900;
                else
                    val += 1000;
            }
        }

        return val;



    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        IO.println(sol.romanToInt("IV"));

    }
    
}
