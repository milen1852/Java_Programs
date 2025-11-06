import java.util.Scanner;

class MilenException extends Exception{
    public MilenException(String message){
        super(message);
    }
}
public class Custom_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 0;
        while(true){
            try{
                System.out.print("Enter the limit : ");
                limit = sc.nextInt();
                if(limit <= 1 || limit >= 10){
                    throw new MilenException("Invalid limit : Enter a valid limit");
                }
                break;
            }
            catch(MilenException e){
                System.out.println(e);
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        int[] nums = new int[limit];
        for(int i = 0; i < limit; i++){
            try{
                 nums[i] = sc.nextInt();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        sc.close();
    }
}
