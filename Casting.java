public class Casting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 25;
        a = b;
        System.out.println(a + " " + b);

        float f = 5.6F;
        int t  = (int)f;
        System.out.println(t);

        byte num1 = 10;
        byte num2 = 20;
        int result = num1 * num2;
        System.out.println(result);
    }
}
