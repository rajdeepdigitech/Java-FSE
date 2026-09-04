package DSA.Recursion;

public class sumofnnum {
    public static int sum(int n) {

        // base condition
        
        if (n == 1)
            return 1;

        return n + sum(n - 2);
             
    }
    public static void main(String[] args) {

        // 1 + 2 + 3 + 4 + 5

        int n = 101;
        // int sum = 0;

        System.out.println(sum(n));

        // for (int i = 0; i <= 100; i++) {
        //     sum += i;
        // }
        // IO.println(sum);
        
    }
}
