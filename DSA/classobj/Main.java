package DSA.classobj;

class random {
    private String color = "Red";
    private String car = "BMW M3";
    random() {
        IO.println("Initialized");

    }
    random(String color, String car) {

        this.color = color;
        this.car = car;

    }
    public void getOutput() {
        IO.println(color);
        IO.println(car);
    }
}


public class Main extends random{
    

    public static void main(String[] args) {
        random obj = new random();
        obj.getOutput();
    }
}
