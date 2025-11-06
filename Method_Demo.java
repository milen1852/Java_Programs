import java.util.Scanner;

class Pen{  
    public void display(){
        System.out.println("Class is Named as Pen");
    }
    public String myPen(int cost){
        if(cost >= 10)
          return "Pen cost is atleast 10";
        return "Pen is not able to buy -> Cost should be atleast 10";
    }
}

public class Method_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost : ");
        int cost = sc.nextInt();
        Pen p = new Pen();
        p.display();

        String str = p.myPen(cost);
        System.out.println(str);

        sc.close();
    }
}
