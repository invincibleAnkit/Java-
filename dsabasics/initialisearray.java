import java.util.Scanner;
public class initialisearray  {
    public static void main(String[]  args){
         Scanner sc = new Scanner(System.in);
    int[] arr = {12,1,2,3,4,5,4};
    int n =arr.length;
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
     sc.close() ;
    }
    
}