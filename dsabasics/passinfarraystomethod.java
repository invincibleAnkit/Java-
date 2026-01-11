import java.util.Scanner;

public class passinfarraystomethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 5;
        System.out.println(x);   // prints 5

        change(x);

        System.out.println(x);   // still prints 5

        sc.close();
    }

    public static void change(int x) {
        x = 10;
    }
}

    
