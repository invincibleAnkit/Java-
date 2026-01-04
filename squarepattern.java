import java.util.Scanner;
public class squarepattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
         System.out.println("enter number of column");
        int g = sc.nextInt();
        for(int i=1;i<=n;i++){//rows controlling
            for(int j=1;j<=g;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
       
        sc.close();
    }
}
