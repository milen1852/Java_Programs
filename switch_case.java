import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();
        
        switch(lim){
            case 1 -> System.out.println("Monday");

            case 2 -> System.out.println("Tuesday");

            default -> System.out.println("Enter a valid limit");
        }

        switch(lim){
            case 3:
            System.out.println("Wednesday");
            case 4:
            System.out.println("Thursday");
            default:
            System.out.println("Validate Once More");
        }
        sc.close();
    }
}
//Program for Switch Case
