/*

18. Inheritance Example 
• Objective: Implement inheritance. 
• Task: Create a base class Animal and a subclass Dog. 
• Instructions: 
o Animal class should have a method makeSound(). 
o Dog class should override makeSound() to print "Bark". 
o Instantiate both classes and call their methods. 


*/

package CoreJava;

import java.lang.IO;

class Animal {
    void bark() {
        IO.println("Sounds");
    }
    void breed() {
        IO.println("Any");
    }

}
class Dog extends Animal {
    @Override
    void bark() {
        IO.println("Growl");
    }
    @Override
    void breed() {
        IO.println("Specific dog breeds only!");
    }

}

public class File18Inheritance extends Dog {
    public static void main(String[] args) {
        Dog dogesh = new Dog();
        Animal animal = new Animal();
        dogesh.bark();
        animal.bark();
    }
}
