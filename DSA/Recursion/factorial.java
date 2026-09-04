package DSA.Recursion;

public class factorial {
    static int fact(int n) {
        // Using recursion
        if (n == 1) {
            return 1;
        }

        return n * fact(n-1);
    }
    public static void main(String[] args) {

        int n = 5;
        // 1*2*3*4*5

        IO.println(fact(n));
    }   

}
