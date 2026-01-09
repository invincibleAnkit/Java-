import java.util.Scanner;
public class questionofarray{
    public static void main(String[]  args){
         Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int n =arr.length;
   for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //output for array
        for(int i=0;i < n;i++){
            if(arr[i]<35){
                System.out.print(arr[i]+" ");

            }
        
        }
     sc.close() ;
    }
    
}
