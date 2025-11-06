abstract class Car{
    abstract void drive();
    abstract void fly();
    public void show(){
        System.out.println("Car is Tested.");
    }
}

class Human extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
    public void fly(){
        System.out.println("Flying...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c = new Human();
        c.drive();
        c.fly();
        c.show();
    }
}
