/*

17. Class and Object Creation 
• Objective: Understand classes and objects. 
• Task: Create a Car class with attributes and methods. 
• Instructions: 
o Define attributes: make, model, year. 
o Implement a method displayDetails() to print car information. 
o Create objects of the Car class and call the method. 


*/


package CoreJava;

import java.lang.IO;

class Car {
    
    int wheelCount = 0;
    int make = 34;
    String model = "Mercedes";
    int year = 2001;
    
    void vroom() {}
    void honk() {}
    void displayDetails() {
        IO.println(wheelCount);
        IO.println(make);
        IO.println(model);
        IO.println(year);
    }



}

public class File17ClassObj extends Car {
    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.displayDetails();

    }
}