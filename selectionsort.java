import java.util.Scanner;
public class selectionsort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

     System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < n ; i++){
      System.out.print("Enter element: ");
          arr[i] = sc.nextInt();
        }
         
      for(int i = 0; i < n-1; i++){
      int min = Integer.MAX_VALUE;
      int mindx = -1;
      for( int j = i ; j < n ; j++){
         if(arr[j]<min){
            min = arr[j];
            mindx = j;
         }
      }
      int temp = arr[i];
      arr[i] = arr[mindx];
      arr[mindx] = temp;

       }
    System.out.println("Sorted array");
    for(int i = 0 ; i < n; i++){
        System.out.println(arr[i] + " ");
       }
    }
}