import java.util.Scanner;
public class sumofarray {
        public static void main(String[]  args){
         Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int sum=0;//to store sum
    int n =arr.length;
   for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //output for array
        for(int i=0;i < n;i++){
           sum+=arr[i];
        }
        System.out.println(sum);
     sc.close() ;
    }
    
}
