
    import java.util.Scanner;
public class linearsearch {
    
    public static void main(String[]  args){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter target element:");
         int x = sc.nextInt();
         System.out.print("enter Array size:");
         int n = sc.nextInt();
         int i;
    int[] arr = new int[n];
   for ( i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        //solution
        boolean flag = false;
        for( i=0;i<10;i++){
      if(arr[i]==x){
        flag=true;
        break;
      }
        }
        if(flag==true){
                    System.out.println("element found at "+i);
        }
        else{
              System.out.println("element not found" );
        }
     sc.close() ;
    }
    
}