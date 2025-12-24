import java.util.Scanner;
public class logical {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if(n>99&&n<1000){
            System.out.println("number is three digit ");
        }else{
            System.out.println("number is not a three digit number");
            sc.close();
        }

    }
    
}
