class A{
    A(){
        super();
        System.out.println("In A");
    }
    A(int n){
        super();
        System.out.println("In A int");
    }
    public void show(){
            System.out.println("Printing in A");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("In B");
    }
    B(int n){
        this();
        System.out.println("In B int");               //All constructors has a super() fun inside them
                                                        //So when normally run its runs A and B in this order
    }
}

public class Super_this {
    public static void main(String[] args) {
        A obj = new B(5);
        obj.show();
    }
}
