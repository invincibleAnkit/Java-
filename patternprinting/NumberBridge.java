import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        n--; 
        int nsp = 1; 

        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = i; j <= n; j++) {
                System.out.print(a++ + " ");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  "); 
            }
            nsp += 2;
            a = n - i + 1; 
            for (int j = i; j <= n; j++) {
                System.out.print(a-- + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}

