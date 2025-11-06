class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a*c + b;
    }
    public double add(double c, double d){
        return c + d;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(6,7));
        System.out.println(c.add(7,8,3));
        System.out.println(c.add(5,6.4));
    }
}
