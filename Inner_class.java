class A {
    public void show(){
        System.out.println("In Show.");
    }
    class B {
        public void config(){
            System.out.println("In Config.");
        }
    }
}

public class Inner_class {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        //A.B Obj1 = new A.B();  //if Static Class B
        obj1.config();
    }
}
