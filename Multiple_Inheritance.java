interface A {
    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X{
    void run();
}

class B implements A, Y{
    public void show(){
        System.out.println("Showing...");
    }
    public void config(){
        System.out.println("Configuring...");
    }
    public void run(){
        System.out.println("Running...");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.show();
        obj1.config();

        Y obj2 = new B();
        obj2.run();
    }
}
