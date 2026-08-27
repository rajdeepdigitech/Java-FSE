public class Main {
    public static void main(String[] args) {

        // char, boolean, double, String, float, int 

        int numberOne = 8;
        int numberTwo = 9;
        int numberThree = 10;


    

        // int result = Math.max(numberOne, numberTwo);
        // result = Math.max(numberThree, result);

        // IO.println(result);

        /**
         * 
         * if (condition) {}
         * else if (condition) {}
         * else {}
         */

        if (numberOne > numberTwo) {
            if (numberOne > numberThree) {
                IO.println(numberOne);
            }
        }
        else if (numberTwo > numberThree) {
            if (numberTwo > numberOne) {
                IO.println(numberTwo);
            }
        }
        else {
            IO.println(numberThree);
        }

    }    
}
