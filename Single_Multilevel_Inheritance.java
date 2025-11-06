class Calc{
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}

class AdvCalc extends Calc{
    public int mul(int a, int b){
        return a * b;
    }
    public float div(int a, int b){
        return a / b;
    }
}

class VeryAdvCalc extends AdvCalc{
    public int power(int a, int b){
        return (int) Math.pow(a, b);
    }
}

public class Single_Multilevel_Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc v = new VeryAdvCalc();
        int r1 = v.add(5, 6);
        int r2 = v.sub(6, 2);
        int r3 = v.mul(6, 5);
        float r4 = v.div(16, 5);
        int r5 = v.power(4,2);
        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);
    }
}
