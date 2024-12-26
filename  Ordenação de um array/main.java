import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(75);
        list.add(34);
        list.add(1);
        list.add(2);

        Collections.sort(list);

        System.out.println("lista ordenada: " + list);
    }
}