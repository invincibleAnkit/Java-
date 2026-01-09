
    import java.util.Scanner;
public class linearsearch {
    
    public static void main(String[]  args){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter target element:");
         int x = sc.nextInt();
         System.out.print("enter Array size:");
         int n = sc.nextInt();
    int[] arr = new int[n];
   for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        //solution
        for(int i=0;i<10;i++){
      if(arr[i]==x){
        System.out.println("element found at "+i);
      }
      
      
        }
     sc.close() ;
    }
    
}