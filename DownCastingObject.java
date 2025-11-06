class A {
    public void show1(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}

public class DownCastingObject{
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.show1();

        B obj2 = (B) obj1;
        obj2.show2();
    }
}