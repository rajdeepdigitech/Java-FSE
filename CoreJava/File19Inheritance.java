/*

19. Interface Implementation 
• Objective: Use interfaces in Java. 
• Task: Define an interface Playable with a method play(). 
• Instructions: 
o Implement the interface in classes Guitar and Piano. 
o Each class should provide its own implementation of play(). 
o Instantiate the classes and call the method. 


*/


package CoreJava;

import java.lang.IO;

interface Playable {
    public void play();
}
class Guitar implements Playable {
    public void play() {
        IO.println("Guitar playing!");
    }

}
class Piano implements Playable {
    public void play() {
        IO.println("Piano playing!");
    }
}
public class File19Inheritance {
    public static void main(String[] args) {

        Piano p1 = new Piano();
        Guitar g1 = new Guitar();
        p1.play();
        g1.play();
        
        
    }

    
}
