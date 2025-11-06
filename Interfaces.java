interface Animal{
    int rate = 20;
    String name = "Jacky";  //final and static cannot ve changed
    void sound();
    void bark();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("The dog is making sound at : " + Animal.rate + " Hz");
    }
    public void bark(){
        System.out.println(Animal.name + " barked loudly.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Animal an = new Dog();
        an.sound();
        an.bark();
    }
}
