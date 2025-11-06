import java.util.Scanner;

public class While_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int limit = sc.nextInt();
        while(i < limit){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
