import java.util.Scanner;
public class output {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[20][30];
        int n = sc.nextInt();
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             arr[i][j]=sc.nextInt();     
            }
       }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
           System.out.print(arr[i][j]+" ");
            }
            System.out.println();
       }
    }
}