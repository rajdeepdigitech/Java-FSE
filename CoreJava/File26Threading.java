/*

26. Thread Creation 
• Objective: Implement multithreading. 
• Task: Create and run two threads that print messages. 
• Instructions: 
o Define a class that extends Thread or implements Runnable. 
o In the run() method, print a message multiple times. 
o Start both threads and observe the output. 

*/



package CoreJava;

import java.lang.IO;

// public class File26Threading implements Runnable {

// }

public class File26Threading extends Thread {
    public void run() {
        System.out.println("The code is running in a thread!");
    }
    public static void main(String[] args) {
        File26Threading thread = new File26Threading();
        File26Threading threadTwo = new File26Threading();
        thread.start();
        threadTwo.start();

        IO.println("This code is outside of the thread!");



    }
}
