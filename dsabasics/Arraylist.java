import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>(6);

        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        arr.add(90);  

        System.out.println();
        System.out.println("Size: " + arr.size());

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        sc.close();
    }
}
