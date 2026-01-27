import java.util.Scanner;
public class reversearray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr={10,20,30,40,50,60};
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.err.println();
        for(int i=0;i<n/2;i++){
            int j=n-1-i;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
