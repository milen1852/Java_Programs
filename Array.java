import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int nums[] = new int[limit];
        for(int i = 0; i < limit; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
