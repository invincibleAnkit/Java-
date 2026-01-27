import java.util.Scanner;
public class two{
    public static void main(String[]  args){
         Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int n = arr.length; 
    arr[0]=10;
     arr[1]=20;
      arr[2]=30;
       arr[3]=40;
        arr[4]=50;
       int x = 60;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==x){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
       }
     sc.close() ;
    }
    
}