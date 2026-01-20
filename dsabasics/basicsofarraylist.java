import java.util.ArrayList;
import java.util.Scanner;
public class basicsofarraylist{
    public static void main(String[]  args){
         Scanner sc = new Scanner(System.in);
         
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10) ;
        arr.add(0,20) ;
        arr.add(0,30) ;
        arr.add(0,40) ;
        arr.add(0,50) ;
        for(int i=0;i<=5;i++){
            System.out.println(arr.get(i));
          }
        }
    }

    