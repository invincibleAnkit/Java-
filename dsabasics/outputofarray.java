
import java.util.Scanner;
public class outputofarray {
    public static void main(String[]  args){
         Scanner sc = new Scanner(System.in);
    int[] arr = new int[7];
   for (int i = 0; i <=6; i++) {
            arr[i] = sc.nextInt();
        }
        //output for array
        for(int i=0;i<=6;i++){
        System.out.print(arr[i]+" ");
        }
     sc.close() ;
    }
    
}