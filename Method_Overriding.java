class A {
    protected void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new B();
        a.show();
        a = new C();
        a.show();
    }
}
