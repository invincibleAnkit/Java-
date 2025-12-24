import java.util.Scanner;
 public class triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side 1");
        int a = sc.nextInt();
          System.out.print("enter side 2");
        int b = sc.nextInt();
          System.out.print("enter side 3");
        int c = sc.nextInt();
        if((a+b)>c&&(b+c)>a&&(c+a)>b){
            System.out.println("it is triangle");
        }
        else{
             System.out.println("it is not a trianglr");
        }
        sc.close();
    }
 }