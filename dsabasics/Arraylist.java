
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        // int[] arr = {30, 20, 40, 50, 23, 89};

    ArrayList<Integer> arr = new ArrayList<>(6);
    arr.add(0,10);
    arr.add(0,20);
     arr.add(0,30);
    arr.add(0,40);
    arr.add(0,50);
    System.out.println(arr);
     
    // for(int i=0;i<=5;i++){
    //     System.out.println(arr.get(i)+" ");
    // } 
        sc.close();
    }
}
