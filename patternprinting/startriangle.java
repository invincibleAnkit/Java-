import java.util.Scanner;
public class startriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
         for (int i=1;i<=n;i++){
          for (int j=1;j<=i;j++){
            System.out.println((char)(j+64)+"");
             System.out.print(j+"");

           }
          System.out.println();
        }
        sc.close();
      }
    }
    