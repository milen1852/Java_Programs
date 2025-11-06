class Calculator{
    public void add(int a, int b){
        int result = a + b;
        System.out.println(result);
    }
}

public class Class_object {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 16;

        Calculator c = new Calculator();
        c.add(n1, n2);
    }
}
