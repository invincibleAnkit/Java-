import java.util.Scanner;
public class profitloss {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price");
        int cp = sc.nextInt();
         System.out.println("enter selling price");
        int sp = sc.nextInt();
      
        if(sp > cp){
            System.out.println("Profit");
        }if (cp > sp) {
              System.out.println("Loss");
        }else{
         System.out.println("no Loss or profit");

        }

        sc.close();
    }

   
}

