import java.util.Arrays;
import java.util.Scanner;

public class Jagged_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int[][] nums = new int[limit][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int) (Math.random() * 100);
            }
        }

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(nums));
        sc.close();
    }
}
