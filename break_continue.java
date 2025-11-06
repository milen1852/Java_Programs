import java.util.Scanner;

public class break_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(i==4)
            for(int j = 0; j <= 3; j++){
                System.out.println("j = " +j);
                if(j==2)
                 break;
            }
            System.out.println("i = " + i);
        }

        for(int i = 0; i < n; i++){
            if(i == 3)
              continue;
            System.out.println(i);
        }
        sc.close();
    }
}
