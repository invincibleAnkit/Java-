import java.util.ArrayList;
import java.util.List;

public class stl {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(30);
        a.add(40);

        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(4);

        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}