import java.util.Scanner;
public class pointereversearray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr={10,20,30,40,50,60};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<=j){
          int temp = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        } 

    sc.close() ;
    }
}
