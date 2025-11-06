class Parent{
    public int add(int a, int b){
        return a + b;
    }
}

class Child1 extends Parent{
    public int mul(int a, int b){
        return a * b;
    }
}

class Child2 extends Parent{
    public int power(int a, int b){
        return (int) Math.pow(a, b);
    }
}

public class Hierarichal_Inheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        System.out.println(c1.mul(2,4));
        System.out.println(c1.add(4,2));

        Child2 c2 = new Child2();
        System.out.println(c2.power(2,4));
        System.out.println(c2.add(2,4));
    }
}