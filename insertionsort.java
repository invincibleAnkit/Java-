import java.util.Scanner;
public class insertionsort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

     System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < n ; i++){
      System.out.print("Enter element: ");
          arr[i] = sc.nextInt();
        }
         
      for(int i = 0; i < n; i++){
      for( int j = i ; j >=1 ; j--){
         if(arr[j]<arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;  
           }
           else break;
        }
      }
    System.out.println("Sorted array");
    for(int i = 0 ; i < n; i++){
        System.out.println(arr[i] + " ");
       }
    }
}