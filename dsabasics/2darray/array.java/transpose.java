import java.util.Scanner;
public class transpose {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] arr ={{1,2},{3,4},{5,6}};

    int m = arr.length , n = arr[0].length;

    for(int j=0;j<n;j++){
        for(int i=0;i<m;i++){
         System.out.print(arr[i][j]+" ");
         }
         System.out.println();
       }
    } 
}
