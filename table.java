import java.util.Scanner;

class table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number");
        int n = sc.nextInt();

        for(int i = n; i <= n*10; i+=n){
            if(i % n == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}