import java.util.Scanner;
public class ap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        // for(int i=1;i<=2*n-1;i+=2){
        //     System.out.println(i);
        // }
        int a=4,d=3 ;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a +=d;

        }
        sc.close();
    }
    
}
