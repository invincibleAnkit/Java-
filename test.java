import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isComposite = false;

        for (int i = 2; i <= n - 1; i++) {

            if (n % i == 0) {     
                isComposite = true;
                break;          
            }
        }
        if (isComposite) {
            System.out.println("True");  
        } else {
            System.out.println("False");  
        }

        sc.close();
    }
}


